package SWEA_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int TESTCASE = 0; TESTCASE < 10; TESTCASE++) {
            int dumpCnt = Integer.parseInt(br.readLine());
            int[] array = new int[100];
            String[] inputs = br.readLine().split(" ");
            for (int i = 0; i < 100; i++) {
                array[i] = Integer.parseInt(inputs[i]);
            }

            int ans = 0;
            for (int k = 0; k <= dumpCnt; k++) {
                int min = 999;
                int max = -1;
                int minIdx = 0;
                int maxIdx = 0;
                for (int i = 0; i < 100; i++) {
                    if(min > array[i]) {
                        min = array[i];
                        minIdx = i;
                    }
                    if(max < array[i]) {
                        max = array[i];
                        maxIdx = i;
                    }
                }

                if(k != dumpCnt) {
                    array[minIdx]++;
                    array[maxIdx]--;
                } else {
                    ans = max - min;
                }
            }
            System.out.println(String.format("#%d %d",TESTCASE+1,ans));
        }

        br.close();
    }
}
