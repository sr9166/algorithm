package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] valArr = new int[n + 1];
        long[][] DP = new long[2][n + 1];
        for(int i = 0; i < n; i++) {
            valArr[i + 1] = Integer.parseInt(br.readLine());
        }

        if(n > 2) {
            DP[0][n] = valArr[n];
            DP[0][n-1] = valArr[n-1] + valArr[n];
            DP[1][n-1] = valArr[n-1] + valArr[n];
            DP[0][n-2] = valArr[n-2] + valArr[n];
            DP[1][n-2] = valArr[n-2] + valArr[n];

            for(int i = n-3; i > 0; i--) {
                DP[0][i] = DP[1][i+1] + valArr[i];
                DP[1][i] = Math.max(DP[0][i+2],DP[1][i+2]) + valArr[i];
            }

            System.out.println(Math.max(Math.max(DP[0][1], DP[1][1]), Math.max(DP[0][2], DP[1][2])));
        } else {
            int sum = 0;
            for(int i = 0; i < n + 1; i++) {
                sum += valArr[i];
            }
            System.out.println(sum);
        }
    }
}
