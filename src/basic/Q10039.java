package basic;

import java.util.Scanner;

public class Q10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int val;
        for (int i = 0; i < 5; i++) {
            val = sc.nextInt();
            if(val < 40) val = 40;
            sum += val;
        }
        sc.close();
        System.out.println(sum/5);
    }
}
