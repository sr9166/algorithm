package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[][] DP = new int[2][n];

        for(int i = 0; i < n; i++) {
            DP[0][i] = 1;
            for(int j = 0; j < i; j++) {
                if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j]) &&
                    DP[0][i] <= DP[0][j])
                    DP[0][i] = DP[0][j] + 1;
            }
        }

        for(int i = n - 1; i >= 0; i--) {
            DP[1][i] = 1;
            for(int j = n - 1; j > i; j--) {
                if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j]) &&
                    DP[1][i] <= DP[1][j])
                    DP[1][i] = DP[1][j] + 1;
            }
        }

        int max = -1;
        for(int i = 0; i < n; i++) {
            if(max < DP[0][i] + DP[1][i])
                max = DP[0][i] + DP[1][i];
        }

        System.out.println(max - 1);
    }
}
