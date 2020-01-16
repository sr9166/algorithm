package SWEA_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1220 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int TEST = 0; TEST < 10; TEST++) {
            int size = Integer.parseInt(br.readLine());
            int[][] arr = new int[size][size];
            for(int i = 0; i < size; i++) {
                String[] inputs = br.readLine().split(" ");
                for (int j = 0; j < size; j++) {
                    arr[i][j] = Integer.parseInt(inputs[j]);
                }
            }

            int ans = 0;
            for(int i = 0; i < size; i++) {
                boolean isN = false;
                for (int j = 0; j < size; j++) {
                    if(arr[j][i] == 1) {
                        isN = true;
                    } else if(isN && arr[j][i] == 2) {
                        isN = false;
                        ans++;
                    }
                }
            }
            System.out.println(String.format("#%d %d", TEST + 1, ans));
        }
        br.close();
    }
}
