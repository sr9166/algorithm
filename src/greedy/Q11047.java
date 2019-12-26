package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11047 {
    public static void main(String[] args) throws IOException {
        int size, target, answer;
        int[] coins;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        size = Integer.parseInt(inputs[0]);
        target = Integer.parseInt(inputs[1]);
        answer = 0;
        coins = new int[size];
        for(int i = 0; i < size; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        for(int i = size-1; i >= 0; i--) {
            while(true) {
                if(target < coins[i]) break;
                else {
                    target -= coins[i];
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
