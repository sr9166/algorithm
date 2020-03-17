package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int pos = 0;
        while(!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            arr[pos++] = queue.poll();
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < n - 1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[n-1]).append(">");

        System.out.println(sb.toString());
    }
}
