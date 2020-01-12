package SWEA_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T, curH, leftH1, leftH2, rightH1, rightH2, maxH, ans;
        int[] array;
        String[] inputs;

        for(int cnt = 1; cnt <= 10; cnt++) {

            T = Integer.parseInt(br.readLine());
            array = new int[T];
            inputs = br.readLine().split(" ");
            for (int i = 0; i < T; i++) {
                array[i] = Integer.parseInt(inputs[i]);
            }

            leftH2 = 0;
            leftH1 = array[0];
            curH = array[1];
            rightH1 = array[2];
            rightH2 = array[3];
            ans = 0;
            maxH = 0;

            for (int i = 0; i < T - 4; i++) {
                leftH2 = leftH1;
                leftH1 = curH;
                curH = rightH1;
                rightH1 = rightH2;
                rightH2 = array[i + 4];

                maxH = Math.max(Math.max(leftH1, leftH2), Math.max(rightH1, rightH2));
                if (maxH < curH) {
                    ans += (curH - maxH);
                }
            }

            System.out.println(String.format("#%d %d",cnt, ans));
        }
    }
}
