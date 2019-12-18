package Q20190918;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parse(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            if(line.startsWith("push")) {
                int num = parse(line.split(" ")[1]);
                queue.add(num);
                continue;
            } else if (line.equals("pop")) {
                if(!queue.isEmpty())
                    bw.write(String.valueOf(queue.poll()));
                else
                    bw.write("-1");
            } else if (line.equals("size")) {
                bw.write(String.valueOf(queue.size()));
            } else if (line.equals("empty")) {
                if(queue.isEmpty())
                    bw.write("1");
                else
                    bw.write("0");
            } else if (line.equals("front")) {
                if(!queue.isEmpty())
                    bw.write(String.valueOf(queue.peek()));
                else
                    bw.write("-1");
            } else if (line.equals("back")) {
                if(!queue.isEmpty())
                    bw.write("" + queue.toArray()[queue.size() - 1]);
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
