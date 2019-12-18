package DP;

import java.util.Scanner;

public class Q10844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        long[][] arr = new long[n][10];
        arr[0] = new long[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        for(int i = 1; i < n; i++) {
            long[] tempArr = new long[10];
            tempArr[0] = arr[i-1][1] % 1000000000;
            tempArr[9] = arr[i-1][8] % 1000000000;
            for(int j = 1; j <= 8; j++) {
                tempArr[j] = (arr[i-1][j-1] + arr[i-1][j+1]) % 1000000000;
            }
            arr[i] = tempArr;
        }

        long sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += arr[n-1][i];
        }
        System.out.println(sum % 1000000000);
    }
}
