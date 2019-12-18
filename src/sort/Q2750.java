package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] ary = new int[t];
        for(int i = 0; i < t; i++) {
            ary[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(ary);
        for(int i = 0; i < t; i++) {
            System.out.println(ary[i]);
        }
    }
}
