package math;

import java.util.Scanner;

public class Q1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();
        System.out.println(Math.min(Math.min(x,y),Math.min(Math.abs(x-w), Math.abs(y-h))));
    }
}
