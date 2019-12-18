package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for(int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[length - 1]);
    }
}
