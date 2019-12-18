package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] DP = new int[n];

        for(int i = 0; i < n; i++) {
            DP[i] = 1;
            for(int j = 0; j < i; j++) {
                if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j]) &&
                    DP[i] <= DP[j])
                    DP[i] = DP[j] + 1;
            }
        }

        int length = 0;
        for(int i = 0; i < n; i++) {
            if(length < DP[i])
                length = DP[i];
        }
        System.out.println(length);
    }
}
