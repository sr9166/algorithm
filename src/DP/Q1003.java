package DP;

import java.io.*;

public class Q1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Pair[] dp = new Pair[41];
        dp[0] = new Pair(1,0);
        dp[1] = new Pair(0,1);
        for(int i = 2; i < dp.length; i++) {
            dp[i] = new Pair(dp[i-1].x + dp[i-2].x, dp[i-1].y + dp[i-2].y);
        }
        for(int i = 0; i < n; i++) {
            int idx = Integer.parseInt(br.readLine());
            bw.write(dp[idx] + "\n");
        }
        bw.flush();
    }

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return String.format("%d %d",x,y);
        }
    }
}
