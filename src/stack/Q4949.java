package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String input = "";
        while(true) {
            input = br.readLine();
            if(input.equals(".")) break;

            for (Character ch : input.toCharArray()) {
                if (ch == '(') stack.push(ch);
                if (ch == '[') stack.push(ch);
                else if(ch == ')') {
                    if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    else  {
                        stack.push(ch);
                        break;
                    }
                }
                else if(ch == ']') {
                    if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    else  {
                        stack.push(ch);
                        break;
                    }
                }
            }

            if(stack.isEmpty()) System.out.println("yes");
            else System.out.println("no");
            stack.clear();
        }
        br.close();
    }
}
