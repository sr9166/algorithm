package math;

import java.io.*;

public class Q5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs;
        int first, second;
        boolean isFirstBigger;
        while(true) {
            inputs = br.readLine().split(" ");
            if(inputs[0].equals("0") && inputs[1].equals("0")) break;

            first = Integer.parseInt(inputs[0]);
            second = Integer.parseInt(inputs[1]);

            isFirstBigger = first > second;

            if(isFirstBigger && first%second == 0) {
                bw.write("multiple");
            } else if(!isFirstBigger && second%first == 0) {
                bw.write("factor");
            } else {
                bw.write("neither");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
