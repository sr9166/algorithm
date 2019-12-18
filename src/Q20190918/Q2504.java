package Q20190918;

import java.util.Scanner;
import java.util.Stack;

public class Q2504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        int result = 0;
        int temp = 1;
        Stack<Character> stack = new Stack<>();

        for(char ch : line.toCharArray())
            stack.push(ch);


    }
}
