package DP;

import java.util.Scanner;

public class Q9461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -1;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if(max < val)
                max = val;
            arr[i] = val;
        }

        long[][] dp = new long[2][101];
        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[0][1] = 1;
        dp[1][1] = 2;
        dp[0][2] = 2;
        dp[1][2] = 3;
        for(int i = 3; i < 101; i++) {
            dp[0][i] = dp[1][i-1] + dp[1][i-3];
            dp[1][i] = dp[0][i] + dp[0][i-2];
        }

        for(int i = 0; i < n; i++) {
            System.out.println(dp[(arr[i]+1)%2][(arr[i]-1)/2]);
        }
    }
}
