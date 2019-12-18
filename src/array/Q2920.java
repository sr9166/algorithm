package array;

import java.util.Scanner;

public class Q2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];
        for(int i = 0; i < 8; i++) {
            array[i] = scanner.nextInt();
        }
        int[] ascending = {1,2,3,4,5,6,7,8};
        int[] descending = {8,7,6,5,4,3,2,1};
        boolean isAsc = true;
        boolean isDes = true;
        for(int i = 0; i < 8; i++) {
            if(array[i] != ascending[i])
                isAsc = false;
            if(array[i] != descending[i])
                isDes = false;
        }
        if(isAsc)
            System.out.println("ascending");
        else if(isDes)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
