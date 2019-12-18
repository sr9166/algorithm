package strings;

import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        String[] ary = line.trim().split(" ");
        if(ary[0].equals(""))
            System.out.println(0);
        else
            System.out.println(ary.length);
    }
}
