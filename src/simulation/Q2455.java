package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[4][2];
        String[] inputs;
        for (int i = 0; i < 4; i++) {
            inputs = br.readLine().split(" ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(inputs[j]);
            }
        }
        br.close();

        int max = -1;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum -= arr[i][0];
            sum += arr[i][1];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
