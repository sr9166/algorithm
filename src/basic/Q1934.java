package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputs;
        for (int TEST = 0; TEST < n; TEST++) {
            inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            System.out.println(a*b/GCD(a,b));
        }
        br.close();
    }

    static int GCD(int a, int b) {
        if(b == 0) return 0;

        while(b > 0) {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
}
