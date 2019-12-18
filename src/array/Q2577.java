package array;

import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int mul = a*b*c;
        int[] array = new int[10];
        int temp;
        while(mul > 0) {
            temp = mul%10;
            mul /= 10;
            array[temp] += 1;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
