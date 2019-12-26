package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1931 {
    static class Pair implements Comparable<Pair>{
        int start;
        int end;

        @Override
        public int compareTo(Pair o) {
            if(end == o.end) return Integer.compare(start, o.start);
            else return Integer.compare(end, o.end);
        }

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Pair[] meetings = new Pair[size];
        String[] inputs;

        for(int i = 0; i < size; i++) {
            inputs = br.readLine().split(" ");
            int start = Integer.parseInt(inputs[0]);
            int end = Integer.parseInt(inputs[1]);
            meetings[i] = new Pair(start, end);
        }

        Arrays.sort(meetings);

        int answer = 0;
        int endTime = 0;
        for(int i = 0; i < size; i++) {
            if (endTime <= meetings[i].start)  {
                answer ++;
                endTime = meetings[i].end;
            }
        }
        System.out.println(answer);
    }
}
