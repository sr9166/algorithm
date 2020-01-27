package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TESTCASECNT = Integer.parseInt(br.readLine());
        for (int TEST = 0; TEST < TESTCASECNT; TEST++) {
            int size = Integer.parseInt(br.readLine());

            HashMap<String, Integer> map = new HashMap<>();
            String[] inputs;
            String key;
            for (int i = 0; i < size; i++) {
                inputs = br.readLine().split(" ");
                key = inputs[1];
                if(map.containsKey(key)) map.put(key, map.get(key)+1);
                else map.put(key, 2);
            }

            int ans = 1;
            for(String str: map.keySet()) {
                ans *= map.get(str);
            }
            System.out.println(ans-1);
        }

        br.close();
    }
}
