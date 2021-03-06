package sort;

import java.io.*;

public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number =  bf.readLine();
        int num = Integer.parseInt(number);
        int[] ary = new int[number.length()];
        int idx = 0;
        while(num > 0) {
            ary[idx] = num%10;
            num /= 10;
            idx++;
        }
        quickSort(ary);
        for(int i = 0; i < ary.length; i++) {
            bw.write(String.valueOf(ary[i]));
        }
        bw.flush();
    }

    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] > pivot) low++;
            while (arr[high] < pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
