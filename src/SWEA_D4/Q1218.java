package SWEA_D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int TEST = 0; TEST < 10; TEST++) {
            int length = Integer.parseInt(br.readLine());
            String target = br.readLine();
            Stack<Character> stack = new Stack<>();
            //'()', '[]', '{}', '<>'
            for(char ch : target.toCharArray()) {
                if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    continue;
                }
                else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                    continue;
                }
                else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }
                else if(ch == '>' && !stack.isEmpty() && stack.peek() == '<') {
                    stack.pop();
                    continue;
                }
                stack.push(ch);
            }
            System.out.println(String.format("#%d %d", TEST + 1, stack.isEmpty()?1:0));
        }
        br.close();
    }
}
