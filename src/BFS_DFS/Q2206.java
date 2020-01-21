package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q2206 {
    static String input;
    static String[] inputs;
    static int height, width;
    static int[][] map;
    static boolean[][][] visit;
    static Pair curXY;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[] ans;

    static class Pair {
        int x;
        int y;
        int cnt;
        boolean isBroken;

        public Pair(int x, int y, int cnt, boolean isBroken) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.isBroken = isBroken;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputs = br.readLine().split(" ");
        height = Integer.parseInt(inputs[0]);
        width = Integer.parseInt(inputs[1]);
        map = new int[height][width];
        visit = new boolean[height][width][2];
        ans = new int[height*width + 1];
        for (int i = 0; i < height; i++) {
            input = br.readLine();
            for (int j = 0; j < width; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        br.close();

        curXY = new Pair(0,0, 1, false);
        Stack<Pair> stack = new Stack<>();
        stack.push(curXY);
        visit[curXY.x][curXY.y][0] = true;

        while(!stack.isEmpty()) {
            curXY = stack.pop();
            if(curXY.x == height-1 && curXY.y == width-1) {
                ans[curXY.cnt]++;
            }

            for (int i = 0; i < 4; i++) {
                int x = curXY.x + dx[i];
                int y = curXY.y + dy[i];
                if(x >= 0 && x < height && y >= 0 && y < width) {
                     if(map[x][y] == 0 && !visit[x][y][0]) {
                         if(curXY.isBroken) {
                             stack.push(new Pair(x,y, curXY.cnt+1, true));
                             visit[x][y][1] = true;
                         } else {
                             stack.push(new Pair(x,y, curXY.cnt+1, false));
                             visit[x][y][0] = true;
                         }
                     } else if(map[x][y] == 1 && !visit[x][y][1]) {
                        stack.push(new Pair(x,y, curXY.cnt+1, true));
                        visit[x][y][1] = true;
                    }
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(String.format("i: %2d, ans[%2d]: %d", i, i, ans[i]));
        }
        System.out.println(-1);
    }
}
