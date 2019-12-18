package basic;

import sun.awt.AWTAccessor;

import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int b1 = b%10;
        int b2 = b/10%10;
        int b3 = b/100;
        System.out.println(a*b1);
        System.out.println(a*b2);
        System.out.println(a*b3);
        System.out.println(a*b);
    }
}
