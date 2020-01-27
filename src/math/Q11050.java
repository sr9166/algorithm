package math;

import java.util.Scanner;

public class Q11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int ans = factorial(N)/(factorial(K)*factorial(N-K));
        System.out.println(ans);
    }

    static int factorial(int n) {
        if(n == 0) return 1;
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans*=i;
        }
        return ans;
    }
}
