package math;

import java.util.Scanner;

public class Q3053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        scanner.close();
        System.out.println(String.format("%.6f", Math.PI*r*r));
        System.out.println(String.format("%.6f", 2.0*r*r));
    }
}
