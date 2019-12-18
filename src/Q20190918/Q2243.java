package Q20190918;

import java.io.*;
import java.util.*;

public class Q2243 {
    public static void main(String[] args) {
        SC.init();
        int n = SC.nextInt();
        TreeMap<Integer, Long> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            String[] arr = SC.readLineSplit(" ");
            int a = SC.parseInt(arr[0]);
            if(a == 1) { // delete and print
                int idx = SC.parseInt(arr[1]);
                long cnt = 0;

                for(int key : map.keySet()) {
                    cnt += map.get(key);
                    if(cnt >= idx) {
                        SC.write(key);
                        map.replace(key, map.get(key) - 1);
                        break;
                    }
                }
            } else if(a == 2) { // add
                int value = SC.parseInt(arr[1]);
                long cnt = SC.parseLong(arr[2]);
                if(cnt > 0) {
                    if(map.containsKey(value)) map.replace(value, map.get(value) + cnt);
                    else map.put(value,cnt);
                } else {
                    map.replace(value, map.get(value) + cnt);
                }
            }
        }
        SC.flush();
    }

    static class SC {
        static BufferedReader br;
        static BufferedWriter bw;

        public static void init() {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public static void write(int num) {
            try {
                bw.write(num + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void flush() {
            try {
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

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
