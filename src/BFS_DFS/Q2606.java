package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2606 {
    static boolean[] marked;
    static int[][] graph;
    static int size;
    static int edgeCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        edgeCnt = Integer.parseInt(br.readLine());
        size++;
        marked = new boolean[size];
        graph = new int[size][size];

        for(int i = 0; i < edgeCnt; i++) {
            String[] line = br.readLine().split(" ");
            int i1 = Integer.parseInt(line[0]);
            int i2 = Integer.parseInt(line[1]);

            graph[i1][i2] = 1;
            graph[i2][i1] = 1;
        }

        dfs(1);
        int ans = 0;
        for(int i = 2; i < size; i++) {
            if(marked[i])
                ans++;
        }
        System.out.println(ans);
    }

    static void dfs(int idx) {
        marked[idx] = true;
        for(int i = 1; i < size; i++) {
            if(!marked[i] && graph[idx][i] == 1) {
                dfs(i);
            }
        }
    }
}
