package math;

import java.util.Scanner;

public class Q1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int profit = c-b;
        scanner.close();
        if(profit <= 0) System.out.println(-1);
        else System.out.println(a/profit + 1);
    }
}
