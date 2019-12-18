package Q20190918;

import java.io.*;
import java.util.Stack;

public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parse(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            if(line.startsWith("push")) {
                int num = parse(line.split(" ")[1]);
                stack.add(num);
                continue;
            } else if (line.equals("pop")) {
                if(!stack.empty())
                    bw.write(String.valueOf(stack.pop()));
                else
                    bw.write("-1");
            } else if (line.equals("size")) {
                bw.write(String.valueOf(stack.size()));
            } else if (line.equals("empty")) {
                if(stack.empty())
                    bw.write("1");
                else
                    bw.write("0");
            } else if (line.equals("top")) {
                if(!stack.empty())
                    bw.write(String.valueOf(stack.get(stack.size() - 1)));
                else
                    bw.write("-1");
            }
            bw.newLine();
        }
        bw.flush();
    }

    private static int parse(String string) {
        return Integer.parseInt(string);
    }
}
