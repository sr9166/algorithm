package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        long[] DP = new long[n];
        DP[0] = Integer.parseInt(arr[0]);

        long max = DP[0];
        for(int i = 1; i < n; i++) {
            if(DP[i-1] + Integer.parseInt(arr[i]) > Integer.parseInt(arr[i]))
                DP[i] = DP[i-1] + Integer.parseInt(arr[i]);
            else
                DP[i] = Integer.parseInt(arr[i]);

            if(max < DP[i])
                max = DP[i];
        }


        System.out.println(max);
    }
}
