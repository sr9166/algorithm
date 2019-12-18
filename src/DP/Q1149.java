package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[3];
        for(int i = 0; i < n; i++) {
            String[] numArr = br.readLine().split(" ");
            long a = Integer.parseInt(numArr[0]) + Math.min(arr[1], arr[2]);
            long b = Integer.parseInt(numArr[1]) + Math.min(arr[0], arr[2]);
            long c = Integer.parseInt(numArr[2]) + Math.min(arr[0], arr[1]);
            arr[0] = a;
            arr[1] = b;
            arr[2] = c;
        }

        System.out.println(Math.min(Math.min(arr[0], arr[1]),arr[2]));
    }
}
