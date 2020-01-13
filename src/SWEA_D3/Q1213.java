package SWEA_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int TESTCASE = 0; TESTCASE < 10; TESTCASE++) {
            int testCaseNumber = Integer.parseInt(br.readLine());
            String target = br.readLine();
            String source = br.readLine();

            boolean isStart = source.startsWith(target);
            boolean isEnd = source.endsWith(target);
            String[] splits = source.split(target);
            int ans = splits.length - 1;
            if(isStart) ans++;
            if(isEnd) ans++;

            System.out.println(String.format("#%d %d", testCaseNumber, ans));
        }

        br.close();
    }
}
