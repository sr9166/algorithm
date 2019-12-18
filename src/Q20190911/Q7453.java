package Q20190911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Q7453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = parseInt(br.readLine());
        long[] A = new long[length];
        long[] B = new long[length];
        long[] C = new long[length];
        long[] D = new long[length];

        long[] AB = new long[length*length];
        HashMap<Long, Integer> CD = new HashMap<>();
        long ans = 0;

        for(int i = 0; i < length; i++) {
            String[] line = br.readLine().split(" ");
            A[i] = parseLong(line[0]);
            B[i] = parseLong(line[1]);
            C[i] = parseLong(line[2]);
            D[i] = parseLong(line[3]);
        }

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                AB[i*length+j] = A[i] + B[j];
                long key = C[i] + D[j];
                if(CD.containsKey(key)) CD.replace(key, CD.get(key) + 1);
                else CD.put(key, 1);
            }
        }

        for(int i = 0; i < AB.length; i++) {
            long target = AB[i] * -1;
            if(CD.containsKey(target)) ans += CD.get(target);
        }

        System.out.println(ans);
    }

    private static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    private static long parseLong(String str) {
        return Long.parseLong(str);
    }
}
