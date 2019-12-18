package Q20190911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Q2143 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long target = parse(br.readLine());
        long aLength = parse(br.readLine());
        String[] arrA = br.readLine().split(" ");
        long bLength = parse(br.readLine());
        String[] arrB = br.readLine().split(" ");
        long ans = 0;

        ArrayList<Long> partA = new ArrayList<>();
        HashMap<Long, Long> partB = new HashMap<>();

        for(int i = 0; i < aLength; i++) {
            long sum = parse(arrA[i]);
            partA.add(sum);
            for(int j = i + 1; j < aLength; j++) {
                sum += parse(arrA[j]);
                partA.add(sum);
            }
        }

        for(int i = 0; i < bLength; i++) {
            long sum = parse(arrB[i]);
            if(partB.containsKey(sum)) partB.replace(sum, partB.get(sum)+1);
            else partB.put(sum, 1l);

            for(int j = i + 1; j < bLength; j++) {
                sum += parse(arrB[j]);
                if(partB.containsKey(sum)) partB.replace(sum, partB.get(sum)+1);
                else partB.put(sum, 1l);
            }
        }

        for(Long l : partA) {
            if(partB.containsKey(target - l)) ans += partB.get(target - l);
        }

        System.out.println(ans);
    }

    private static long parse(String str) {
        return Long.parseLong(str);
    }
}

