package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        String input = "";
        for (int TEST = 0; TEST < testNumber; TEST++) {
            input = br.readLine();
            for (Character ch : input.toCharArray()) {
                if (ch == '(') stack.push(ch);
                else {
                    if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    else  {
                        stack.push(ch);
                        break;
                    }
                }

            }
            if(stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
            stack.clear();
        }
        br.close();
    }
}
