package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        int[] array = new int[9];
        int[] sortArray = new int[9];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
            sortArray[i] = array[i];
        }
        Arrays.sort(sortArray);
        int max = sortArray[8];
        for(int i = 0; i < 9; i++) {
            if(max == array[i]) {
                System.out.println(max);
                System.out.println(i + 1);
                return;
            }
        }
    }
}
