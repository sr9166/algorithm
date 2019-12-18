package strings;

import java.util.Scanner;

public class Q5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
        int sum = 0;
        for(char ch : str.toCharArray()) {
            sum += calcSec(ch);
        }
        System.out.println(sum);
    }

    private static int calcSec(char ch) {
        if(ch == 'A' || ch == 'B' || ch == 'C')
            return 2 + 1;
        if(ch == 'D' || ch == 'E' || ch == 'F')
            return 3 + 1;
        if(ch == 'G' || ch == 'H' || ch == 'I')
            return 4 + 1;
        if(ch == 'J' || ch == 'K' || ch == 'L')
            return 5 + 1;
        if(ch == 'M' || ch == 'N' || ch == 'O')
            return 6 + 1;
        if(ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S')
            return 7 + 1;
        if(ch == 'T' || ch == 'U' || ch == 'V')
            return 8 + 1;
        if(ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z')
            return 9 + 1;
        return -1;
    }
}
