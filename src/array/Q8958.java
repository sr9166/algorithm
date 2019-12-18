package array;

import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            String[] arr = scanner.next().split("X");
            int answer = 0;
            for(int j = 0; j < arr.length; j++) {
                answer += func(arr[j].length());
            }
            System.out.println(answer);
        }
    }
    public static int func(int len) {
        int sum = 0;
        for(int i = 1; i <= len; i++) {
            sum += i;
        }
        return sum;
    }
}
