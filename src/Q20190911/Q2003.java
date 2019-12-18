package Q20190911;

import java.io.*;

public class Q2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ary = br.readLine().split(" ");
        int n = Integer.parseInt(ary[0]);
        int m = Integer.parseInt(ary[1]);

        ary = br.readLine().split(" ");
        int start = 0;
        int end = 0;
        int cnt = 0;
        while(end < n) {
            int sum = 0;
            for(int i = start; i <= end; i++) {
                sum += Integer.parseInt(ary[i]);
            }
            if(sum == m) cnt++;
            if(sum <= m) end++;
            if(sum >= m) start++;
        }
        System.out.println(cnt);
    }
}
