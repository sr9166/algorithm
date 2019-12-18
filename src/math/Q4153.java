package math;

import java.util.Arrays;
import java.util.Scanner;

public class Q4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int[] ary = new int[3];
            for(int i = 0; i < 3; i++) {
                ary[i] = scanner.nextInt();
            }
            Arrays.sort(ary);
            int a = ary[0];
            int b = ary[1];
            int c = ary[2];
            if (a == 0 && b == 0 && c == 0) {
                scanner.close();
                break;
            }
            else {
                if(a*a+b*b==c*c)
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
        }
    }
}
