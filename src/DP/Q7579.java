package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = br.readLine().split(" ");
        int size = Integer.parseInt(strings[0]);
        int additionalMemory = Integer.parseInt(strings[1]);

        int[] bytes = new int[size];
        int[] costs = new int[size];
        int[][] DP = new int[2][Integer.MAX_VALUE];

        strings = br.readLine().split(" ");
        for(int i = 0; i < size; i++) {
            bytes[i] = Integer.parseInt(strings[i]);
        }
        strings = br.readLine().split(" ");
        for(int i = 0; i < size; i++) {
            costs[i] = Integer.parseInt(strings[i]);
        }

//        for(int i = 0; i < size; i++) {
//            for(int j = ; j>=items.get(i).weight; j--) {
//                DP[j] = Math.max(DP[j], DP[j-items.get(i).weight] + items.get(i).value);
//            }
//        }
//
//        for(int i=0; i<N; i++) {
//            for(int j=W; j>=items.get(i).weight; j--) {
//                DP[j] = Math.max(DP[j], DP[j-items.get(i).weight] + items.get(i).value);
//            }
//        }
    }
}
