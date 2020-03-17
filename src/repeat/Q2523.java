package repeat;

import java.util.Scanner;

public class Q2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
