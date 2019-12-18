package condition;

import java.util.Scanner;

public class Q1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if(a<b)
            System.out.println("<");
        if(a>b)
            System.out.println(">");
        if(a==b)
            System.out.println("==");
    }
}
