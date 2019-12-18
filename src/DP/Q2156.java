package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] DP = new long[2][n+3];
        if(n < 3) {
            int sum = 0;
            for(int i = 0; i < n; i++) {
                sum += Integer.parseInt(br.readLine());
            }
            System.out.println(sum);
        } else {
            for(int i = 3; i < n + 3; i++) {
                int val = Integer.parseInt(br.readLine());
                DP[0][i] = DP[1][i-1] + val;
                DP[1][i] = Math.max(Math.max(DP[0][i-2], DP[1][i-2]),Math.max(DP[0][i-3], DP[1][i-3])) + val;
            }

            System.out.println(Math.max(Math.max(Math.max(DP[0][n], DP[1][n]), Math.max(DP[0][n+1], DP[1][n+1])), Math.max(DP[0][n+2], DP[1][n+2])));
        }
    }
}
