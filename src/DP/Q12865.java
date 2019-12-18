package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q12865 {
    static ArrayList<Pair> items = new ArrayList<>();
    static int N, W;
    static int[] DP = new int[100001];

    static class Pair {
        int weight;
        int value;

        Pair(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        N = Integer.parseInt(strings[0]);
        W = Integer.parseInt(strings[1]);

        for(int i = 0; i < N; i++) {
            strings = br.readLine().split(" ");
            items.add(new Pair(Integer.parseInt(strings[0]), Integer.parseInt(strings[1])));
        }

        for(int i=0; i<N; i++) {
            for(int j=W; j>=items.get(i).weight; j--) {
                DP[j] = Math.max(DP[j], DP[j-items.get(i).weight] + items.get(i).value);
            }
        }

        System.out.println(DP[W]);
    }
}
