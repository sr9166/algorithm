package bruteforce;

import java.util.Scanner;

public class Q1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int CNT = scanner.nextInt();
        scanner.close();
        int cnt = 0;
        int target = 666;
        while(cnt != CNT) {
            if(is666(target)) {
                cnt++;
            }
            target++;
        }
        System.out.println(target-1);
    }

    private static boolean is666(int n) {
        int cnt = 0;
        while(n > 0) {
            if(n%10 == 6) {
                cnt++;
                if(cnt == 3)
                    break;
            }
            else
                cnt = 0;
            n /= 10;
        }
        if(cnt == 3)
            return true;
        else
            return false;
    }
}
