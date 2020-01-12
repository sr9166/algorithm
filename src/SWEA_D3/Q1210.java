package SWEA_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1210 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int TESTCASE = 0; TESTCASE < 10; TESTCASE++) {
            int testCaseNumber = Integer.parseInt(br.readLine());
            int[][] arr = new int[100][100];
            String[] inputs;
            for(int i = 0; i < 100; i++) {
                inputs = br.readLine().split(" ");
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(inputs[j]);
                }
            }

            int x = 0, y = 99;
            for(int i = 0; i < 100; i++) {
                if(arr[y][i] == 2) {
                    x = i;
                    break;
                }
            }

            boolean isVertical = true;
            boolean isLeft = false;
            while(true) {
                if(y == 0) {
                    break;
                }

                if(isVertical) {
                    if(x != 0 && arr[y][x - 1] != 0) {
                        isVertical = false;
                        isLeft = true;
                    }

                    if(x != 99 && arr[y][x + 1] != 0) {
                        isVertical = false;
                        isLeft = false;
                    }
                } else {
                    if(arr[y][x] != 0) {
                        isVertical = true;
                    }
                }

                if(isVertical) {
                    y--;
                } else {
                    if(isLeft) {
                        x--;
                    } else {
                        x++;
                    }
                }
            }

            System.out.println(String.format("#%d %d", testCaseNumber, x));
        }
    }
}
