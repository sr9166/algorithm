package SWEA_D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int k = 0; k < T; k++) {
            int testCaseNumber = Integer.parseInt(br.readLine());
            int[] arr = new int[101];
            String[] inputs = br.readLine().split(" ");
            for(int i = 0; i < 1000; i++) {
                arr[Integer.parseInt(inputs[i])]++;
            }

            int max = -1;
            int maxIdx = 0;
            for(int i = 100; i >= 0; i--) {
                if(max < arr[i]) {
                    max = arr[i];
                    maxIdx = i;
                }
            }

            System.out.println(String.format("#%d %d", testCaseNumber, maxIdx));
        }

        br.close();
    }
}
