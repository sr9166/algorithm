package array;

import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[42];
        for(int i = 0; i < 10; i++) {
            array[scanner.nextInt() % 42] += 1;
        }
        int cnt = 0;
        for(int i = 0; i < 42; i++) {
            if(array[i] > 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
