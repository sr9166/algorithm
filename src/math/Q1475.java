package math;

import java.util.Scanner;

public class Q1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        int[] arr = new int[10];
        for (Character ch : input.toCharArray()) {
            arr[ch-'0']++;
        }

        int max = -1;
        for (int i = 0; i < 10; i++) {
            if(i==6||i==9) continue;
            max = Math.max(max, arr[i]);
        }
        int six = arr[6];
        int nine = arr[9];
        int bigger = Math.max(six, nine);
        int smaller = Math.min(six, nine);
        int diff = bigger-smaller;
        int result = smaller + (diff%2==0 ? diff/2 : (diff/2)+1);

        max = Math.max(max, result);

        System.out.println(max);
    }
}
