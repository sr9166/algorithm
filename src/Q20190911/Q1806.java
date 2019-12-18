package Q20190911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A=new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());
        int left=0; int right=0;
        int size=N;
        int sum=A[left];
        int min=N+1;
        int length=right-left+1;
        while(left<=right && right < size) {
            if(sum>=M) {
                length=right-left+1;
                if(min > length)
                    min=length;
                if(left+1 < size)
                    sum-=A[left];
                left++;
                continue;
            }
            if(sum < M) {
                if(right+1<size)
                    sum+=A[right+1];
                right++;
                continue;
            }
        }
        if(min==N+1)
            min=0;
        System.out.println(min);
    }
}
