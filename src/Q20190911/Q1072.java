package Q20190911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line  = br.readLine().split(" ");
        long x = Long.parseLong(line[0]); //전체 판수
        long y = Long.parseLong(line[1]); //이간 판수
        long z = y*100/x;                       //승률

        if(z >= 99)
            System.out.println(-1);
        else {
            long low = 0;
            long high = 1000000001;
            long mid = 0;
            long tempZ = 0;
            while(low <= high) {
                mid = (high+low)/2;
                tempZ = (y+mid)*100/(x+mid);

                System.out.println(String.format("low: %d, mid: %d, high: %d, tempZ: %d",low,mid,high,tempZ));

                if(tempZ > z) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(low);
        }
    }
}
