package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q11403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[][] arr = new int[size][size];
        int[][] ans = new int[size][size];
        String[] inputs;
        for (int i = 0; i < size; i++) {
            inputs = br.readLine().split(" ");
            for (int j = 0; j < size; j++) {
                int val = Integer.parseInt(inputs[j]);
                arr[i][j] = val;
                ans[i][j] = val;
            }
        }
        br.close();

        for (int i = 0; i < size; i++) {
            boolean[] visit = new boolean[size];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            while(!queue.isEmpty()) {
                int val = queue.poll();
                for (int j = 0; j < size; j++) {
                    if(!visit[j] && arr[val][j] == 1) {
                        queue.add(j);
                        visit[j] = true;
                        ans[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(ans[i][0]);
            for (int j = 1; j < size; j++) {
                System.out.print(String.format(" %d", ans[i][j]));
            }
            System.out.println();
        }
    }
}
