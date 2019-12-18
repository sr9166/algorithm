package math;

import java.util.Scanner;

public class Q2775 {
    public static void main(String[] args) {
        int[][] ary = new int[20][20];
        for(int p = 0; p < 20; p++) {
            ary[0][p] = p;
        }
        for(int p = 1; p < 20; p++) {
            for(int q = 0; q < 20; q++) {
                int sum = 0;
                for(int r = 0; r <= q; r++) {
                    sum += ary[p-1][r];
                }
                ary[p][q] = sum;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int k,n; // k층 n호
        for (int i = 0; i < t; i++) {
            k = scanner.nextInt();
            n = scanner.nextInt();
            System.out.println(ary[k][n]);
        }
        scanner.close();
    }
}
