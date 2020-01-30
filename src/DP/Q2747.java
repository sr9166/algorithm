package DP;

import java.util.Scanner;

public class Q2747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        long[] DP = new long[46];
        DP[0] = 0;
        DP[1] = 1;
        for (int i = 2; i <= n; i++) {
            DP[i] = DP[i-1] + DP[i-2];
        }

        System.out.println(DP[n]);
    }
}
