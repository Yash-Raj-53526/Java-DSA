package BinarySearch;

import java.util.Arrays;

public class main {
    public static int binarySearch(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 4 };
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 4));
        // printArray(arr);
    }
}
