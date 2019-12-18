package Q20190918;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Q11003 {
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair pair) {
            if(this.val > pair.val)
                return 1;
            else
                return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");
        int n = parseInt(line[0]);
        int l = parseInt(line[1]);

        line = br.readLine().split(" ");

        Deque<Pair> deque = new LinkedList<>();
        Pair min = new Pair(parseInt(line[0]),0);
        for(int i = 0; i < n; i ++) {
            if(min.idx < i + l - 1) {
                deque.pollFirst();
            }
            deque.add(new Pair(parseInt(line[i]), i));

        }



        bw.flush();
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }

}
