package SWEA_D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1219 {
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
            String[] inputs = br.readLine().split(" ");
            int testCaseNumber = Integer.parseInt(inputs[0]);
            int length = Integer.parseInt(inputs[1]);
            int[][] map = new int[100][100];
            boolean[][] visit = new boolean[100][100];
            inputs = br.readLine().split(" ");
            for(int i = 0; i < length*2; i+=2) {
                map[Integer.parseInt(inputs[i])][Integer.parseInt(inputs[i+1])] = 1;
            }

            int x = 0;
            int y = 0;
            boolean ans = false;
            Stack<Pair> stack = new Stack<>();
            for(int i = 0; i < 100; i++) {
                if(map[0][i] == 1) {
                    stack.push(new Pair(0,i));
                    visit[0][i] = true;
                }
            }

            while(!stack.isEmpty()) {
                Pair p = stack.pop();
                for(int i = 0; i < 100; i++) {
                    if(!visit[p.y][i] && map[p.y][i] == 1) {
                        if(i == 99) {
                            ans = true;
                            stack.clear();
                            break;
                        } else {
                            stack.push(new Pair(p.y, i));
                        }
                    }
                }
            }
            System.out.println(String.format("#%d %d", testCaseNumber, ans?1:0));
        }
        br.close();
    }
}
