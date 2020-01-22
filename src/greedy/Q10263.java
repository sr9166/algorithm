package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q10263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[size];
        Integer[] sortedArr;
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        br.close();
        Arrays.sort(arr);
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        sortedArr = list.toArray(new Integer[list.size()]);

        int ans = 0;
        int leftIdx = 0;
        int rightIdx = size - 1;
        while(leftIdx <= rightIdx && sortedArr[leftIdx] != 0) {
            if(sortedArr[leftIdx] >= rightIdx - leftIdx + 1) {
                leftIdx++;
            } else {
                for (int i = leftIdx; i <= rightIdx; i++) {
                    sortedArr[i]--;
                    if(sortedArr[i] == 0)  {
                        rightIdx = i-1;
                        break;
                    }
                }
            }
            ans++;
        }

        System.out.println(ans);
    }
}
