package repeat;

import java.util.Scanner;

public class Q2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*size-1 - 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
