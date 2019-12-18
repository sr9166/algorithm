package repeat;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        int answer = 0;
        for(int i = 1; i <= N; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
