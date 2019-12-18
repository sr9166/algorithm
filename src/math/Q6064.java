package math;

import java.util.Scanner;

public class Q6064 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0 ; i < t; i++) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            int targetX = scanner.nextInt();
            int targetY = scanner.nextInt();
            int y = targetX;
            int cnt = targetX;
            int tempY = -1;
            for (int k = 0; k < N; k++) {
                tempY = y%N == 0 ? N : y%N;
                if (tempY == targetY)
                    break;
                y += M;
                cnt += M;
            }

            if (tempY == targetY)
                System.out.println(cnt);
            else
                System.out.println(-1);
        }
    }
}
