package Q20190911;

import java.io.*;

public class Q2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        long n = Long.parseLong(line[0]);
        long m = Long.parseLong(line[1]);

        line = br.readLine().split(" ");

        long low = 0;
        long high = Long.MAX_VALUE;
        long mid;

        long ans = 0;
        while(low <= high) {
            mid = (low+high)/2;

            long sum = 0;
            for(int i = 0; i < n; i++) {
                long temp = Long.parseLong(line[i]);
                if(temp > mid)
                    sum += temp - mid > 0 ? temp - mid : 0;
            }

            if(sum >= m) {
                low = mid + 1;
                if(mid > ans)
                    ans = mid;
            } else if (sum < m) {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
