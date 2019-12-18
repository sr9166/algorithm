package strings;

import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int r;
        String line = "";
        for(int i = 0; i < t; i++) {
            r = scanner.nextInt();
            line = scanner.next();
            for(int j = 0; j < r*line.length(); j++) {
                System.out.print(line.charAt(j/r));
            }
            System.out.print("\n");
        }
    }
}
