package bruteforce;

import java.util.Scanner;

public class Q2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        scanner.close();
        int ans = 0;
        for(int i = 1; i <= target; i++) {
            if(sum(i) == target) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }

    private static int sum(int n) {
        int sum = n;
        while(n > 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
