import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }
        int s = start;
        int e = end;

        int mid = (start + end) / 2;

        int pivot = arr[mid];
        while (s <= e) {

            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, start, e);
        quickSort(arr, s, end);
    }

    public static void main(String[] args) {

        int[] arr = { 12, 23, 4, 1, 2114, 123 };

        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
}