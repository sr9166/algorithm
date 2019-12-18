package math;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int five = 0;
        int three = 0;
        for(int i = 0; i <= n/3; i++) {
            if((n-i*3)%5==0) {
                three = i;
                five = (n-i*3)/5;
                break;
            }
        }
        if(five == 0 && three == 0)
            System.out.println(-1);
        else {
            System.out.println(five + three);
        }
    }
}
