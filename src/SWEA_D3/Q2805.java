package SWEA_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testSize = Integer.parseInt(br.readLine());
        for (int TESTSIZE = 0; TESTSIZE < testSize; TESTSIZE++) {
            int size = Integer.parseInt(br.readLine());
            int[][] arr = new int[size][size];
            boolean[][] visit = new boolean[size][size];
            String input;
            for (int i = 0; i < size; i++) {
                input = br.readLine();
                for (int j = 0; j < size; j++) {
                    arr[i][j] = Character.getNumericValue(input.charAt(j));
                }
            }

            int ans = 0;

            for (int i = 0; i < size; i++) {
                if(i <= size/2) {
                    for (int j = 0; j < i * 2 + 1; j++) {
                        ans+=arr[i][size/2 - i + j];
                    }
                }
                else {
                    for (int j = 0; j < (size*2-1) - i*2; j++) {
                        ans+=arr[i][i - size/2 + j];
                    }
                }
            }

            System.out.println(String.format("#%d %d", TESTSIZE+1, ans));
        }

        br.close();
    }
}
