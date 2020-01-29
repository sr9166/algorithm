package DP;

        import java.util.Scanner;

public class Q11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] DP = new int[1001];
        DP[1] = 1;
        DP[2] = 2;
        for (int i = 3; i <= n; i++) {
            DP[i] = (DP[i-2] + DP[i-1])%10007;
        }
        System.out.println(DP[n]);
    }
}
