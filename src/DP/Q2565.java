package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2565 {
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        Pair(String[] arr) {
            this.x = Integer.parseInt(arr[0]);
            this.y = Integer.parseInt(arr[1]);
        }

        @Override
        public int compareTo(Pair pair) {
            if(this.x > pair.x)
                return 1;
            else
                return -1;
        }

        @Override
        public String toString() {
            return String.format("x: %d, y: %d",x,y);
        }

        public boolean isBigger(Pair pair) {
            if(this.y > pair.y)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Pair[] arr = new Pair[n];

        for(int i = 0; i < n; i++) {
            arr[i] = new Pair(br.readLine().split(" "));
        }

        Arrays.sort(arr);

        int[] DP = new int[n];
        for(int i = 0; i < n; i++) {
            DP[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arr[i].isBigger(arr[j]) && DP[i] <= DP[j])
                    DP[i] = DP[j] + 1;
            }
        }

        int max = -1;
        for(int i = 0; i < n; i++) {
            if(max < DP[i])
                max = DP[i];
        }

        System.out.println(n - max);
    }
}
