import java.util.ArrayList;

public class MergeSort {

    public static void mergeSort(int[] arr, int st, int end) {

        if (st >= end) {
            return;
        }

        int mid = st + (end - st) / 2;

        mergeSort(arr, st, mid);

        // Sort right half
        mergeSort(arr, mid + 1, end);

        // Merge both sorted halves
        merge(arr, st, mid, end);
    }

    public static void merge(int[] arr, int st, int mid, int end) {

        ArrayList<Integer> temp = new ArrayList<>();

        int i = st;
        int j = mid + 1;

        // Compare elements from both halves
        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }

        // Remaining elements from left half
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        // Remaining elements from right half
        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }

        // Copy temp back into original array
        for (int k = 0; k < temp.size(); k++) {
            arr[st + k] = temp.get(k);
        }
    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};

        mergeSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}