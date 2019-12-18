package sort;

import java.io.*;

public class Q2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(bf.readLine());
        int[] ary = new int[length];
        int[] cntAry = new int[8001];
        double mean = 0;
        int midVal = 0;
        int mostShown = 0;
        int range = 0;
        int maxCnt = -1;
        boolean isDup = false;

        for(int i = 0; i < length; i++) {
            ary[i] = Integer.parseInt(bf.readLine());
            mean += ary[i];
            cntAry[ary[i] + 4000]++;
        }

        quickSort(ary);
        mean /= (double)length;
        midVal = ary[length/2];
        range = ary[length - 1] - ary[0];

        for(int i = 0; i < cntAry.length; i++) {
            if(maxCnt < cntAry[i]) {
                maxCnt = cntAry[i];
                mostShown = i - 4000;
                isDup = false;
            }
            else if(maxCnt == cntAry[i] && !isDup) {
                mostShown = i - 4000;
                isDup = true;
            }
        }

        System.out.println(String.format("%.0f", mean));
        System.out.println(midVal);
        System.out.println(mostShown);
        System.out.println(range);
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
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
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
