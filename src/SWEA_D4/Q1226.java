package SWEA_D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1226 {
    static final int MAPSIZE = 16;
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

        for (int TEST = 0; TEST < 10; TEST++) {
            int testNumber = Integer.parseInt(br.readLine());
            int[][] map = new int[MAPSIZE][MAPSIZE];
            boolean[][] visit = new boolean[MAPSIZE][MAPSIZE];
            Pair curXY = null;
            String input = "";
            for (int i = 0; i < MAPSIZE; i++) {
                input = br.readLine();
                for (int j = 0; j < MAPSIZE; j++) {
                    map[i][j] = Character.getNumericValue(input.charAt(j));
                    if(input.charAt(j) == '2') curXY = new Pair(i, j);
                }
            }

            Stack<Pair> stack = new Stack<>();
            stack.push(curXY);
            visit[curXY.x][curXY.y] = true;
            boolean ans = false;
            while(!stack.isEmpty()) {
                curXY = stack.pop();
                if(map[curXY.x][curXY.y] == 3) {
                    ans = true;
                    stack.clear();
                    break;
                }

                for (int i = 0; i < 4; i++) {
                    int x = curXY.x + dx[i];
                    int y = curXY.y + dy[i];
                    if(x >= 0 && x < MAPSIZE && y >= 0 && y < MAPSIZE) {
                        if(!visit[x][y] && map[x][y] != 1) {
                            stack.push(new Pair(x,y));
                            visit[x][y] = true;
                        }
                    }
                } // end for
            }

            System.out.println(String.format("#%d %d", testNumber, ans?1:0));
        }

        br.close();
    }
}
