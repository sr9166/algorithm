package basic;

import java.util.Scanner;

public class Q1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println((double) a / b);
    }
}
