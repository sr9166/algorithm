package math;

import java.util.Scanner;

public class Q1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            long x = scanner.nextInt();
            long y = scanner.nextInt();
            long distance = y - x;
            if(distance == 1) {
                System.out.println(1);
                continue;
            }
            long k = 2;
            while (k * k < distance) {
                k++;
            }
            if(k*k - k >= distance)
                System.out.println(k*2 - 2);
            else
                System.out.println(k*2 - 1);
        }
        scanner.close();
    }
}
