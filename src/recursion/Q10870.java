package recursion;

import java.util.Scanner;

public class Q10870 {
    static int func(int n) {
        if(n <= 1) return n;
        else return func(n-1) + func(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(func(n));
    }
}
