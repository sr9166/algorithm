package math;

import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        boolean[] ary = new boolean[10001];
        ary[0] = true;
        ary[1] = true;
        for(int i = 2; i < ary.length; i++) {
            if(!ary[i]) {
                for(int j = 2; j*i < ary.length; j++) {
                    ary[j*i] = true;
                }
            }
        }

        int sum = 0;
        int min = -1;
        for(int i = m; i <= n; i++) {
            if(!ary[i]) {
                if(min == -1)
                    min = i;
                sum += i;
            }
        }
        if(sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
