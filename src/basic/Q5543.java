package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Q5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burgers = new int[3];
        int[] drinks = new int[2];

        for (int i = 0; i < 3; i++) {
            burgers[i] = sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            drinks[i] = sc.nextInt();
        }

        Arrays.sort(burgers);
        Arrays.sort(drinks);

        System.out.println(burgers[0] + drinks[0] - 50);
    }
}
