package sort;

import java.io.*;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        String[] ary = new String[n];
        for(int i = 0; i < n; i++) {
            ary[i] = bf.readLine();
        }

        quickSort(ary);

        String temp = "";
        for(int i = 0; i < n; i++) {
            if(!temp.equals(ary[i])) {
                temp = ary[i];
                bw.write(ary[i] + "\n");
            }
        }
        bw.flush();

    }

    public static void quickSort(String[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(String[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(String[] arr, int low, int high) {
        String pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (stringCompare(arr[low], pivot) < 0) low++;
            while (stringCompare(arr[high], pivot) > 0) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static int stringCompare(String s1, String s2) {
        if(s1.length() > s2.length())
            return 1;
        else if(s1.length() < s2.length())
            return -1;
        else
            return s1.compareTo(s2);
    }
}
