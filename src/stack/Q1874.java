package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> arrayList = new ArrayList<>();
        stack.push(0);
        int num = 1;
        for (int idx = 0; idx < size; idx++) {
            int val = Integer.parseInt(br.readLine());
            if(stack.peek() < val) {
                for (int i = num; i <= val; i++) {
                    stack.push(i);
                    arrayList.add("+");
                    num++;
                }
                stack.pop();
                arrayList.add("-");
            } else if(!stack.isEmpty() && stack.peek() == val) {
                stack.pop();
                arrayList.add("-");
            } else if(stack.peek() > val) {
                arrayList.clear();
                arrayList.add("NO");
                break;
            }
        }
        br.close();

        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
