package SWEA_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q2805 {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

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
            Pair curXY = new Pair(size/2, size/2);
            Queue<Pair> queue = new LinkedList<>();
            queue.add(curXY);
            while(!queue.isEmpty()) {
                curXY = queue.poll();
                ans += arr[curXY.x][curXY.y];

                for (int i = 0; i < 4; i++) {
                    int x = curXY.x + dx[i];
                    int y = curXY.y + dy[i];
                    if(x >= 0 && x < size && y >= 0 && y < size) {
                        if(x+y == size/2 || x+y == size/2*3 || ) {
                            break;
                        }
                        else if(!visit[x][y] && arr[x][y] != 1) {
                            queue.add(new Pair(x,y));
                            visit[x][y] = true;
                        }
                    }
                } // end for
            } // end while

            System.out.println(String.format("#%d %d", TESTSIZE+1, ans));
        }

        br.close();
    }
}
