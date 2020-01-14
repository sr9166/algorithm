package SWEA_D3;

import java.util.Scanner;

public class Q1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int TEST = 0; TEST < 10; TEST++) {
            int testCaseNumber = sc.nextInt();
            int src = sc.nextInt();
            int dst = sc.nextInt();
            System.out.println(String.format("#%d %d", testCaseNumber, (int)Math.pow(src, dst)));
        }
        sc.close();
    }
}
