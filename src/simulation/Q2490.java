package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String[] inputs = br.readLine().split(" ");
            Arrays.sort(inputs);
            if(inputs[0].equals("1")) System.out.println("E");
            else if(inputs[1].equals("1")) System.out.println("A");
            else if(inputs[2].equals("1")) System.out.println("B");
            else if(inputs[3].equals("1")) System.out.println("C");
            else System.out.println("D");
        }
        br.close();
    }
}
