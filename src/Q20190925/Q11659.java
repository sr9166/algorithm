package Q20190925;

import java.io.*;

public class Q11659 {

    static int MAX = 100001;
    static long[] arr = new long[MAX];
    static long[] tree = new long[MAX*4];

    // left~right 배열 구간 의미
    static long init(int node, int left, int right) {
        if (left == right) {
            return tree[node] = arr[left];
        }

        int mid = (left + right) / 2;
        return tree[node] = init(node * 2, left, mid) + init(node * 2 + 1, mid + 1, right);
    }

    static long query(int node, int start, int end, int left, int right) {
        if (left > end || right < start)
            return 0;

        if (left <= start && end <= right)
            return tree[node];

        int mid = (start + end) / 2;
        return query(node * 2, start, mid, left, right)
                + query(node * 2 + 1, mid + 1, end, left, right);
    }

    static void update(int node, int left, int right, int idx, long diff) {
        if (idx < left || idx > right)
            return;

        tree[node] += diff;
        if (left != right) {
            int mid = (left + right) / 2;
            update(node * 2, left, mid, idx, diff);
            update(node * 2 + 1, mid + 1, right, idx, diff);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        String[] stringArr = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(stringArr[i]);
        }


        init(1,0,n-1);

        for (int i = 0; i < m; i++) {
            line = br.readLine().split(" ");
            int left = Integer.parseInt(line[0]);
            int right = Integer.parseInt(line[1]);

            bw.write(String.format("%d\n", query(1, 0, n - 1, left - 1, right - 1)));
        }

        bw.flush();
    }
}
