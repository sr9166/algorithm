package DP;

import java.util.Scanner;

public class Q1904 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2; i < n; i++) {
            int val = dp[i-1] + dp[i-2];
            dp[i] = val%15746;
        }

        System.out.println(dp[n-1]);
    }
}
