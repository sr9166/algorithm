package function;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fact(n));
    }

    private static long fact(int n) {
        long ans = 1;
        for(int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}
