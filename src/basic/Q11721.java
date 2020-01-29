package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();

        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
            if((i+1)%10 == 0) System.out.print("\n");
        }
    }
}
