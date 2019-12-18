package strings;

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        scanner.close();
        for(int i = 97; i < 123; i++) {
            System.out.print(line.indexOf(i) + " ");
        }
    }
}
