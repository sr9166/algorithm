package math;

import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int h,w,n,y,x;
        for(int i = 0; i < t; i++) {
            h = scanner.nextInt();
            w = scanner.nextInt();
            n = scanner.nextInt();
            y=0;x=1;
            for(int k = 0; k < n; k++) {
                y++;
                if(y > h) {
                    y = 1;
                    x++;
                }
            }
            System.out.print(y);
            System.out.println(x<10?"0" + x : x);
        }
    }
}
