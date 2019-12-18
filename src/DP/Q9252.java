package DP;

import java.util.Scanner;

public class Q9252 {
    static int[][] DP;
    static char[] result;
    static String a;
    static String b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        b = scanner.nextLine();
        scanner.close();

        if(a.length() > b.length()) {
            String temp = b;
            b = a;
            a = temp;
        }

        DP = new int[a.length() + 1][b.length() + 1];

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
        int ans = DP[a.length()][b.length()];
        System.out.println(ans);

        result = new char[ans];
//        for(int i = 1; i < a.length() + 1; i++) {
//            for(int j = 1; j < b.length() + 1; j++) {
//                System.out.print(String.format("%3d", DP[i][j]));
//            }
//            System.out.println();
//        }
//        System.out.println();

        findResult(a.length(), b.length(), ans);

        System.out.println(result);
    }

    static void findResult(int i, int j, int idx) {
        if(idx < 0)
            return;

        if(DP[i][j] != idx)
            return;

        if(i <= 0 || j <= 0)
            return;

        if(a.charAt(i-1) == b.charAt(j-1)) {
            result[idx-1] = a.charAt(i-1);
            findResult(i-1, j-1, idx - 1);
        } else { // 문자가 다를때
            if (DP[i][j - 1] < DP[i - 1][j])  {
                findResult(i - 1, j, idx);
            } else {
                findResult(i, j - 1, idx);
            }
        }
    }
}

