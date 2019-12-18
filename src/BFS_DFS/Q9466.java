package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Q9466 {
    static int start = -1;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tCase = 0; tCase < t; tCase++) {
            int n = Integer.parseInt(br.readLine());
            n++;
            int[] fav = new int[n];
            String[] line = br.readLine().split(" ");
            for(int i = 1; i < n; i++) {
                fav[i] = Integer.parseInt(line[i - 1]);
            }
            boolean[] marked = new boolean[n];
            for(int i = 1; i < n; i++) {
                Stack<Integer> stack = new Stack<>();
                ArrayList<Integer> arrayList = new ArrayList<>();
                stack.push(i);
                boolean[] visit = new boolean[n];
                visit[i] = true;
                arrayList.add(i);
                int temp = -1;
                while(!stack.isEmpty()) {
                    temp = stack.pop();
                    if(!marked[temp] && !visit[fav[temp]]) {
                        stack.push(fav[temp]);
                        visit[fav[temp]] = true;
                        arrayList.add(fav[temp]);
                    }else if(fav[temp] == i) {
                        for(int k : arrayList) {
                            marked[k] = true;
                        }
                    }
                }
            }
            int cnt = 0;
            for(int k = 1; k < n; k++) {
                if(!marked[k])
                    cnt++;
            }
            System.out.println(cnt);

        }
    }
}
