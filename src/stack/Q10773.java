package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i < size; i++) {
            int val = Integer.parseInt(br.readLine());
            if(val != 0)
                stack.push(val);
            else if(!stack.isEmpty())
                stack.pop();
        }
        br.close();

        int ans = 0;
        while(!stack.isEmpty()) {
            ans += stack.pop();
        }
        System.out.println(ans);
    }
}
