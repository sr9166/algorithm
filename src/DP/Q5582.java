package DP;

import java.util.Scanner;

public class Q5582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        int ans = 0;
        int[][] DP = new int[str1.length()+1][str2.length()+1];

        for(int i = 0; i < str1.length(); i++) {
            for(int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) != str2.charAt(j))
                    DP[i+1][j+1] = 0;
                else {
                    int tmp = DP[i][j] + 1;
                    DP[i+1][j+1] = tmp;
                    ans = Math.max(tmp, ans);
                }
            }
        }

        System.out.println(ans);
    }
}
