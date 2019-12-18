package array;

import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        for(int i = 0; i < C; i++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            double sum = 0;
            for(int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }
            sum /= N;
            int cnt = 0;
            for(int j = 0; j < N; j++) {
                if(arr[j] > sum)
                    cnt++;
            }
            System.out.println(String.format("%.3f%%", cnt/(double)N*100));
        }
    }
}
