package Q20190918;

import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Q2014 {
    public static void main(String[] args) {
        SC.init();

        String[] arr = SC.readLineSplit(" ");
        String[] primeArr = SC.readLineSplit(" ");
        int k = SC.parseInt(arr[0]);
        int n = SC.parseInt(arr[1]);
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i = 0; i < k; i++) {
            pq.add(SC.parseLong(primeArr[i]));
        }

        long head = 0;
        for (int i = 0; i < n; i++) {
            head = pq.poll();
            for (int j = 0; j < k; j++) {
                long value = head * SC.parseLong(primeArr[j]);
                pq.add(value);
                if(head % SC.parseLong(primeArr[j]) == 0)
                    break;
            }
        }

        System.out.println(head);
    }

    static class SC {
        static BufferedReader br;

        public static void init() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public static String readLine() {
            String line = "";
            try {
                line = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        }

        public static String[] readLineSplit(String regex) {
            String[] arr = null;
            try {
                arr = br.readLine().split(regex);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return arr;
        }

        public static int nextInt() {
            int num = 0;
            try {
                num = Integer.parseInt(br.readLine());
            } catch (IOException e ) {
                e.printStackTrace();
            }
            return num;
        }

        public static int parseInt(String string) {
            return Integer.parseInt(string);
        }

        public static long parseLong(String string) {
            return Long.parseLong(string);
        }
    }
}
