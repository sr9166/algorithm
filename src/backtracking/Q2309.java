package backtracking;

import java.util.*;

public class Q2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        List<Integer> tmp = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtracking(arr, tmp, ans);
        Collections.sort(ans);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    static void backtracking(int[] arr, List<Integer> tmp, List<Integer> ans) {

        if(tmp.size() == 7) {
            if(ans.size() != 0) return;

            int sum = 0;
            for (int i = 0; i < tmp.size(); i++) {
                sum += tmp.get(i);
            }
            if(sum == 100) {
                for (int i = 0; i < tmp.size(); i++) {
                    ans.add(tmp.get(i));
                }
            }
            return;
        }

        for (int i = 0; i < 9; i++) {
            if(tmp.contains(arr[i])) continue;

            tmp.add(arr[i]);
            backtracking(arr, tmp, ans);
            tmp.remove(tmp.size()-1);
        }
    }
}
