package Sort;

import java.util.Arrays;

public class InPlaceMerge {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 6, 3, 1, 9};
        mergeSortInPlace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (s >= e) {
            return; // Base case: one element
        }

        int mid = s + (e - s) / 2;

        // Sort both halves
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid + 1, e);

        // Merge sorted halves
        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s + 1]; // +1 because inclusive range

        int i = s;
        int j = m + 1; // Right half starts from mid+1
        int k = 0;

        // Merge both halves into mix[]
        while (i <= m && j <= e) {
            if (arr[i] <= arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= m) {
            mix[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= e) {
            mix[k++] = arr[j++];
        }

        // Copy sorted elements back into original array
        System.arraycopy(mix, 0, arr, s + 0, mix.length);
    }
}

