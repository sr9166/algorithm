package backtracking;

import java.io.*;

public class Q15649 {
    static boolean[] visit;
    static int[] array;
    static int N, M;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);
        br.close();

        visit = new boolean[N + 1];
        array = new int[N + 1];
        for(int i = 0; i < N + 1; i++) {
            array[i] = i;
        }

        dfs(0);
        bw.flush();
        bw.close();
    }

    static void dfs(int cnt) throws IOException {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                bw.write(String.format("%d ", array[i]));
            }
            bw.newLine();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                array[cnt] = i;
                dfs(cnt + 1);
                visit[i] = false;
            }
        }
    }
}
