package function;

import java.util.Scanner;

public class Q1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            if(isHan(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean isHan(int n) {
        if(n < 100) {
            return true;
        }

        int num1 = n % 10;
        n /= 10;
        int num2 = n % 10;
        int diff = num1 - num2;
        while(n >= 10) {
            num1 = num2;
            n /= 10;
            num2 = n % 10;
            if(diff != (num1 - num2))
                return false;
        }
        return true;
    }
}
