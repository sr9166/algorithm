package SWEA_D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1211 {
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

            int x = 0;
            int ans = 987654321;
            int startX = 0;
            int ansIdx = 0;

            for(int i = 0; i < 100; i++) {
                int y = 0;

                if(arr[y][i] != 1) {
                    continue;
                } else {
                    x = i;
                    startX = i;
                }

                int cnt = 1;

                while(true) {
                    if (y == 99) {
                        if(cnt < ans) {
                            ans = cnt;
                            ansIdx = startX;
                        }
                        break;
                    }

                    if (x != 99 && arr[y][x + 1] == 1) { //오른쪽에 길이 있으면 갈 수 있을 떄 까지 오른쪽으로 이동
                        while (true) {
                            x++;
                            cnt++;
                            if (x == 99 || arr[y][x + 1] != 1)
                                break;
                        }
                    } else if (x != 0 && arr[y][x - 1] == 1) { //왼쪽에 길이 있으면 갈 수 있을 떄 까지 왼쪽으로 이동
                        while (true) {
                            x--;
                            cnt++;
                            if (x == 0 || arr[y][x - 1] != 1)
                                break;
                        }
                    }

                    y++;
                    cnt++;
                }
            }

            System.out.println(String.format("#%d %d", testCaseNumber, ansIdx));
        }
        br.close();
    }
}
