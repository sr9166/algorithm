package condition;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        scanner.close();
        min -= 45;
        if(min < 0) {
            min += 60;
            hour -= 1;
        }
        if(hour < 0) {
            hour += 24;
        }
        System.out.println(String.format("%d %d", hour, min));
    }
}
