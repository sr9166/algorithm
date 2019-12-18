package math;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1016 {
    public static void main(String[] args) {
        long min;
        long max;
        int cnt = 0;
        boolean[] isSqrt = new boolean[1000001];
        Scanner scanner = new Scanner(System.in);
        min = scanner.nextLong();
        max = scanner.nextLong();
        scanner.close();
        for(long i = 2; i*i <= max; i++) {
            long start = min / (i*i);
            if(start*i*i != min) start++;
            for(long j = start; i*i*j <=max; j++) {
                isSqrt[(int) (i*i*j - min)] = true;
            }
        }
        for(int i = 0 ; i < max-min+1; i++) {
            if(!isSqrt[(int) (i)]) cnt++;
        }
        System.out.println(cnt);
    }
}
