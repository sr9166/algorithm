package Q20190911;

import java.util.Scanner;

public class Q2748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        long[] ary = new long[91];
        ary[0] = 0;
        ary[1] = 1;
        for(int i = 2; i <= n; i++) {
            ary[i] = ary[i-1]+ary[i-2];
        }
        System.out.println(ary[n]);
    }
}
