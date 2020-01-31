package array;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int idx = 0;
        int cnt = 1;
        while(!list.isEmpty()) {
            if(idx >= list.size()) idx = 0;
            if(cnt % k == 0) {
                ans.add(list.get(idx));
                list.remove(idx);
            } else {
                idx++;
            }
            cnt++;
        }

        System.out.print(String.format("<%d",ans.get(0)));
        for (int i = 1; i < n; i++) {
            System.out.print(String.format(", %d",ans.get(i)));
        }
        System.out.print(">");
    }
}
