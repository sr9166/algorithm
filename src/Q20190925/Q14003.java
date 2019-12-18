package Q20190925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] DP = new int[n];
        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            DP[i] = 1;
            result[i] = arr[i];
            for(int j = 0; j < i; j++) {
                if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j]) && DP[i] <= DP[j]) {
                    DP[i] = DP[j] + 1;
                    result[i] = String.format("%s %s",result[j],arr[i]);
                }
            }
        }

        int length = 0;
        String answer = "";
        for(int i = 0; i < n; i++) {
            if(length < DP[i]) {
                length = DP[i];
                answer = result[i];
            }
        }
        System.out.println(length);
        System.out.println(answer);
    }
}
