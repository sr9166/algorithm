package math;

import java.util.Scanner;

public class Q11051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int[][] DP = new int[N+1][N+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0) DP[i][j] = 1;
                else if(j == i) DP[i][j] = 1;
                else {
                    DP[i][j] = (DP[i-1][j-1] + DP[i-1][j])%10007;
                }
            }
        }

        System.out.println(DP[N][K]);
    }
}
