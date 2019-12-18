package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Q2667 {
    static class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int size;
    static int[][] maps;
    static boolean[][] marked;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        maps = new int[size][size];
        marked = new boolean[size][size];
        for(int i = 0; i < size; i++) {
            String line = br.readLine();
            for(int j = 0; j < size; j++) {
                maps[i][j] = line.charAt(j) - '0';
            }
        }

        Stack<Pair> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(!marked[i][j] && maps[i][j] == 1) {
                    int cnt = 0;
                    stack.push(new Pair(i, j));
                    while(!stack.empty()) {
                        Pair pair = stack.pop();
                        marked[pair.x][pair.y] = true;
                        for(int k = 0; k < 4; k++) {
                            int x = pair.x + dx[k];
                            int y = pair.y + dy[k];
                            if(x >= 0 && x < size && y >= 0 && y < size) {
                                if(maps[x][y] == 1 && !marked[x][y]) {
                                    stack.push(new Pair(x,y));
                                    marked[x][y] = true;
                                }
                            }
                        }
                        cnt++;
                    }
                    arrayList.add(cnt);
                }
            }
        }

        System.out.println(arrayList.size());
        Collections.sort(arrayList);
        for(int i : arrayList) {
            System.out.println(i);
        }
    }
}
