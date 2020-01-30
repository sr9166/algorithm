package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[2][n];
        String[] inputs;

        for (int i = 0; i < 2; i++) {
            inputs = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(inputs[j]);
            }
        }
        br.close();

        Arrays.sort(arr[0]);
        Arrays.sort(arr[1]);

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += arr[0][i]*arr[1][n-i-1];
        }
        System.out.println(ans);
    }
}
