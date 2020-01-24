package math;

import java.util.Scanner;

public class Q2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();

        int a = first, b = second;
        while(b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }

        int GCD = a;
        int LCM = a * (first/a) * (second/a);

        System.out.println(GCD);
        System.out.println(LCM);
    }
}
