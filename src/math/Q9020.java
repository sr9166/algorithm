package math;

import java.util.Scanner;

public class Q9020 {
    public static void main(String[] args) {
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

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            for(int j = n/2; j < n; j++) {
                if(!ary[j] && !ary[n-j]) {
                    System.out.println(String.format("%d %d", n-j, j));
                    break;
                }
            }
        }
        scanner.close();
    }
}
