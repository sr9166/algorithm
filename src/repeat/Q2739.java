package repeat;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= 9; i++) {
            System.out.println(String.format("%d * %d = %d", n,i,n*i));
        }
    }
}

