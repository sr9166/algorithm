package Q20190911;

        import java.util.Scanner;

public class Q1644 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        scanner.close();
        boolean[] arr = new boolean[4000000];
        int[] ary = new int[300000];
        arr[0] = true;
        arr[1] = true;
        int idx = 0;
        for(int i = 2; i < arr.length; i++) {
            if(!arr[i]) {
//                System.out.println(String.format("idx: %d, num: %d",idx,i));
                ary[idx] = i;
                idx++;
                for(int j = 2; j*i < arr.length; j++) {
                    arr[j*i] = true;
                }
            }
        }

        int left = 0;
        int right = 0;
        long sum = 2;
        int cnt = 0;
        while(ary[left] <= target && right < ary.length - 1) {
            if(sum < target) {
                sum += ary[right+1];
                right++;
            } else {
                if(sum == target)
                    cnt++;
                sum -= ary[left++];
            }
        }
        System.out.println(cnt);
    }
}
