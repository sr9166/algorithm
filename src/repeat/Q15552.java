package repeat;

import java.io.*;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T, a, b;
        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String line = br.readLine();
            a = Integer.parseInt(line.split(" ")[0]);
            b = Integer.parseInt(line.split(" ")[1]);
            bw.write(String.valueOf(a+b));
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
