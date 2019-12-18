package Q20190918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2042 {
    public static void main(String[] args) {
        SC.init();
        String[] arr = SC.readLineSplit(" ");
        int n = SC.parseInt(arr[0]);
        int m = SC.parseInt(arr[1]);
        int k = SC.parseInt(arr[2]);

        int[] numArr = new int[n];
        for(int i = 0; i < n; i++) {
            numArr[i] = SC.nextInt();
        }

        for(int i = 0; i < m+k; i++) {
            arr = SC.readLineSplit(" ");
            int a = SC.parseInt(arr[0]);
            int b = SC.parseInt(arr[1]);
            int c = SC.parseInt(arr[2]);
            if(a == 1) {
                numArr[b-1] = c;
            } else if (a == 2) {
                long sum = 0;
                for(int j = b-1; j < c; j++) {
                    sum += numArr[j];
                }
                System.out.println(sum);
            }
        }

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

        public static String[] readLineSplit(String regex) {
            String[] arr = null;
            try {
                arr = br.readLine().split(regex);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return arr;
        }

        public static long parseLong(String string) {
            return Long.parseLong(string);
        }
    }
}
