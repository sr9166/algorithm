package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        int[][] ans = new int[size-1][2];
        String[] inputs = br.readLine().split(" ");
        br.close();
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        int target = arr[0];
        for (int i = 1; i < size; i++) {
            int gcd = GCD(target, arr[i]);
            ans[i-1][0] = target/gcd;
            ans[i-1][1] = arr[i]/gcd;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size - 1; i++) {
            sb.append(ans[i][0]).append('/').append(ans[i][1]).append("\n");
        }
        System.out.println(sb);
    }

    static int GCD(int a, int b) {
        if(b == 0) return 0;

        while(b > 0) {
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
}
