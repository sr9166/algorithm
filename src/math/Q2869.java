package math;

import java.util.Scanner;

public class Q2869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();
        scanner.close();
        if((v-a) % (a-b) == 0)
            System.out.println((v - a)/(a-b) + 1);
        else
            System.out.println((v - a)/(a-b) + 2);

    }
}
