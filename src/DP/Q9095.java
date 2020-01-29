package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int[] DP = new int[12];
        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 4;
        for (int i = 4; i < 12; i++) {
            DP[i] = DP[i-1] + DP[i-2] + DP[i-3];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(DP[arr[i]]);
        }
    }
}
