package Q20190911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = parseInt(br.readLine());
        int[] minArr = new int[3];
        int[] maxArr = new int[3];

        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");

            int minA = parseInt(line[0]) + Math.min(minArr[0], minArr[1]);
            int minB = parseInt(line[1]) + min(minArr[0], minArr[1], minArr[2]);
            int minC = parseInt(line[2]) + Math.min(minArr[1], minArr[2]);

            minArr[0] = minA;
            minArr[1] = minB;
            minArr[2] = minC;

            int maxA = parseInt(line[0]) + Math.max(maxArr[0], maxArr[1]);
            int maxB = parseInt(line[1]) + max(maxArr[0], maxArr[1], maxArr[2]);
            int maxC = parseInt(line[2]) + Math.max(maxArr[1], maxArr[2]);

            maxArr[0] = maxA;
            maxArr[1] = maxB;
            maxArr[2] = maxC;
        }

        int minScore = min(minArr[0],minArr[1],minArr[2]);
        int maxScore = max(maxArr[0],maxArr[1],maxArr[2]);

        System.out.println(String.format("%d %d",maxScore,minScore));
    }

    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }

    private static int min(int a, int b, int c) {
        return Math.min(Math.min(a,b),c);
    }

    private static int max(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
}
