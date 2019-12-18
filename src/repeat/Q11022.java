package repeat;

import java.io.*;

public class Q11022 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T, a, b;
        String line = "";
        try {
            T = Integer.parseInt(br.readLine());
            for(int i = 1; i <= T; i++) {
                line = br.readLine();
                a = Integer.parseInt(line.split(" ")[0]);
                b = Integer.parseInt(line.split(" ")[1]);
                bw.write(String.format("Case #%d: %d + %d = %d\n",i,a,b,a+b));
            }
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
