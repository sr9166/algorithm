package strings;

import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        scanner.close();
        line = line.toUpperCase();
        int[] cnt = new int[26];
        for(int i = 0; i < line.length(); i++) {
            cnt[line.charAt(i) - 65] += 1;
        }
        int max = 0;
        char ch = ' ';
        boolean dup = false;
        for(int i = 0; i < cnt.length; i++) {
            if(max < cnt[i]) {
                max = cnt[i];
                ch = (char) (i + 65);
                dup = false;
            } else if (max == cnt[i]) {
                dup = true;
            }
        }
        if(dup) {
            System.out.println("?");
        } else {
            System.out.println(ch);
        }
    }
}
