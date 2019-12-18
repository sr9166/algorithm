package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int idx = 0; idx < t; idx++) {
            int k = Integer.parseInt(br.readLine());
            String[] tempArr = br.readLine().split(" ");
            int[] arr = new int[k];
            for(int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(tempArr[i]);
            }
            Arrays.sort(arr);
            long sum = 0;
            for(int i = 0; i < k/2; i++) {
                sum = 0;
            }
        }
    }
}
