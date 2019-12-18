package bruteforce;

import java.util.Scanner;

public class Q2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) {
            ary[i] = scanner.nextInt();
        }
        scanner.close();
        int max = -1;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    int sum = ary[i] + ary[j] + ary[k];
                    if(sum > target)
                        continue;
                    else if(sum > max)
                        max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
