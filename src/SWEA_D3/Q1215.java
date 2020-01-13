package SWEA_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int TESTCASE = 0; TESTCASE < 10; TESTCASE++) {
            int length = Integer.parseInt(br.readLine());
            String[] arr = new String[8];
            for(int i = 0; i < 8; i++) {
                arr[i] = br.readLine();
            }

            int ans = 0;
            // 가로 방향 팰린드롬 계산
            for(int i = 0; i < 8; i++) {
                for(int j = 0; j <= 8-length; j++) {
                    String target = arr[i].substring(j, j + length);
                    if(isPalindrome(target)) ans++;
                }
            }

            // 세로 방향 팰린드롬 계산
            for(int i = 0; i < 8; i++) {
                for(int k = 0; k <= 8 - length; k++) {
                    String target = "";
                    for (int j = 0; j < length; j++) {
                        target += arr[k + j].charAt(i);
                    }
                    if(isPalindrome(target)) ans++;
                }
            }

            System.out.println(String.format("#%d %d", TESTCASE + 1, ans));
        }
        br.close();
    }

    public static boolean isPalindrome (String str) {
        boolean flag = true;
        for(int i = 0; i <= str.length()/2; i++) {
            char leftCh = str.charAt(i);
            char rightCh = str.charAt(str.length() - (i+1));
            if(leftCh != rightCh) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
