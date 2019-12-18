package function;

public class Q4673 {
    public static void main(String[] args) {
         boolean[] arr = new boolean[10000];
         for(int i = 1; i < 10000; i++) {
             int temp = i;
             temp = calc(temp);
             while(temp < 10000 && !arr[temp]) {
                 arr[temp] = true;
                 temp = calc(temp);
             }
         }
         for(int i = 1; i < 10000; i++) {
             if(!arr[i])
                 System.out.println(i);
         }
    }

    private static int calc(int temp) {
        int ans = temp;
        while(temp > 0) {
            ans += temp % 10;
            temp /= 10;
        }
        return ans;
    }
}
