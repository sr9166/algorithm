package math;

import java.util.Scanner;

public class Q1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        boolean[] ary = new boolean[n+1];
        scanner.close();
        ary[0] = true;
        ary[1] = true;
        for(int i = 2; i < ary.length; i++) {
            if(!ary[i]) {
                if(i >= m)
                    System.out.println(i);
                for(int j = 2; j*i < ary.length; j++) {
                    ary[j*i] = true;
                }
            }
        }
    }
}
