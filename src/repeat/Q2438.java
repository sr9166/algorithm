package repeat;

import java.io.*;

public class Q2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) {
            StringBuilder line = new StringBuilder();
            for(int j = 1; j <= i; j++) {
                line.append("*");
            }
            bw.write(line.toString());
            bw.newLine();
        }
        bw.flush();
    }
}
