package condition;

import java.util.Scanner;

public class Q10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        if(a <= b) {
            if(b <= c) { // a <= b <= c
                System.out.println(b);
            } else { // a <= b , c <= b
                System.out.println(Math.max(a,c));
            }
        } else { //b <= a
            if (a <= c) { // b <= a <= c
                System.out.println(a);
            } else { // b <= a, c <= a
                System.out.println(Math.max(b,c));
            }
        }
    }
}
