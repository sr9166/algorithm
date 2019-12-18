package strings;

import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
        String[] ary = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cnt = str.length();
        int length = str.length();

        for(int i = 0; i < ary.length; i++) {
            String temp = str.replaceAll(ary[i], "");
            if(ary[i].equals("dz=")) {
                cnt += ((length - temp.length()) / ary[i].length()) * (2 - ary[i].length());
            } else {
                cnt += ((length - temp.length()) / ary[i].length()) * (1 - ary[i].length());
            }
        }
        System.out.println(cnt);
    }
}
