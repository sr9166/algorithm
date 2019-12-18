package math;

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int sum=0, i=1,x,y;
        while(sum < n) {
            sum += i;
            i++;
        }
        if(i % 2 == 0) {
            x=1;y=i-x;
            for(int k = 0; k < sum-n; k++) {
                x++;
                y--;
            }
        } else {
            y=1;x=i-y;
            for(int k = 0; k < sum-n; k++) {
                y++;
                x--;
            }
        }
        System.out.println(String.format("%d/%d",x,y));
    }
}
