package DP;

import java.util.Scanner;

public class Q9251 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int[][] DP = new int[a.length() + 1][b.length() + 1];


        for(int i = 1; i < a.length() + 1; i++) {
            char chA = a.charAt(i - 1);
            for(int j = 1; j < b.length() + 1; j++) {
                char chB = b.charAt(j - 1);
                if(chA == chB)
                    DP[i][j] = DP[i-1][j-1] + 1;
                else {
                    DP[i][j] = Math.max(DP[i-1][j] , DP[i][j-1]);
                }
            }
        }

        System.out.println(DP[a.length()][b.length()]);
    }
}
