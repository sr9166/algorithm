package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] DP = new long[n][n];
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < line.length; j++) {
                DP[i][j] = Integer.parseInt(line[j]);
            }
        }

        for(int i = n-2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                DP[i][j] = DP[i][j] + Math.max(DP[i+1][j], DP[i+1][j+1]);
            }
        }

        System.out.println(DP[0][0]);
    }
}
