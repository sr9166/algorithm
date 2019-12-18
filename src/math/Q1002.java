package math;

import java.util.Scanner;

public class Q1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();
            int DIST = (int) (Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
            int R = (int) Math.pow(r1+r2,2);
            double dist = Math.sqrt(DIST);
            double r = Math.pow(dist + Math.min(r1, r2), 2);
            double RR = Math.pow(Math.max(r1, r2), 2);

            //원이 어떻게 이루어져 있는지 검사
            //일치
            if(DIST == 0 && r1==r2)
                System.out.println(-1);
            //외접
            else if(DIST == R)
                System.out.println(1);
            //내접
            else if(r == RR)
                System.out.println(1);
            //떨어져있고 만나지 않을때
            else if(DIST > Math.pow(r1+r2,2))
                System.out.println(0);
            //안에 있고 만나지 않을때
            else if(r < RR)
                System.out.println(0);
            //그 외
            else
                System.out.println(2);

        }
    }
}
