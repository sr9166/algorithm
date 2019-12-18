package repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int X = Integer.parseInt(line.split(" ")[1]);
        line = br.readLine();
        String[] splitLine = line.split(" ");
        for(int i = 0; i < N; i++) {
            int target = Integer.parseInt(splitLine[i]);
            if(target < X) {
                System.out.print(target + " ");
            }
        }
    }
}
