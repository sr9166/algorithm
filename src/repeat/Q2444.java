package repeat;

import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < 2*n-1; i++) {
            if(i < n) {
                for (int j = 0; j < n-1-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j <= i-n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2*n-1-i)*2 - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
