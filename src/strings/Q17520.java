package strings;

import java.util.Scanner;

public class Q17520 {
    public static void main(String[] args) {
        final int DIV = 16769023;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        n = (n+1)/2;
        long result = 1;
        while(n > 10) {
            result *= Math.pow(2,10);
            n -= 10;
            result %= DIV;
        }
        result *= Math.pow(2,n);
        result %= DIV;
        System.out.println(result%DIV);
    }
}
