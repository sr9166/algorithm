package SWEA_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int TESTCASE = 0; TESTCASE < 10; TESTCASE++) {
            int testCaseNumber = Integer.parseInt(br.readLine());
            int[][] arr = new int[100][100];
            int[] sumArr = new int[202];

            for(int i = 0; i < 100; i++) {
                String[] inputs = br.readLine().split(" ");
                int sum = 0;
                for(int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(inputs[j]);
                    sum += arr[i][j];
                }
                sumArr[i] = sum;
            }

            for(int i = 0; i < 100; i++) {
                int sum = 0;
                for(int j = 0; j < 100; j++) {
                    sum += arr[j][i];
                }
                sumArr[i+100] = sum;
            }

            int rightDiagonalSum = 0, leftDiagonalSum = 0;
            for(int i = 0; i < 100; i++) {
                rightDiagonalSum += arr[i][i];
                leftDiagonalSum += arr[i][99-i];
            }
            sumArr[200] = rightDiagonalSum;
            sumArr[201] = leftDiagonalSum;

            Arrays.sort(sumArr);
            System.out.println(String.format("#%d %d", testCaseNumber, sumArr[201]));

        }

        br.close();
    }
}
