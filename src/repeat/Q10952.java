package repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        int a, b;
        while(!(line = br.readLine()).equals("")) {
            a = Integer.parseInt(line.split(" ")[0]);
            b = Integer.parseInt(line.split(" ")[1]);
            if(a+b == 0)
                return;
            System.out.println(a + b);
        }
    }
}
