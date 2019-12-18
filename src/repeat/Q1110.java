package repeat;

import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        scanner.close();
        int a = target/10;
        int b = target%10;
        int c = -1;
        int cnt = 0;
        while(c != target) {
            c = b*10+(a+b)%10;
            cnt ++ ;
            a = c/10;
            b = c%10;
        }
        System.out.println(cnt);
    }
}
