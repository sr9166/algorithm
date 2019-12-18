package math;

import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int cnt = 1;
        int i = 1;
        while(cnt < n) {
            cnt += 6*i;
            i++;
        }
        System.out.println(i);
    }
}
