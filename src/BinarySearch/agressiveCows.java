package BinarySearch;

import java.util.Arrays;

public class agressiveCows {
    public static boolean isPossible(int arr[], int n, int c, int dist) { // Time complexity O(N)
        int count = 1;
        int lastPos = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] - lastPos >= dist) {
                count++;
                lastPos = arr[i];
            }
            if (count == c) {
                return true;
            }
        }
        return false;
    }

    public static int maxDistance(int arr[], int n, int c) { // Time complexity O(N log(max-min))
        Arrays.sort(arr); // Time complexity O(N logN)
        int start = 0;
        int end = arr[n - 1] - arr[0];
        int ans = -1;

        if (n < c) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, n, c, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, 9 };
        int n = arr.length;
        int c = 3;
        System.out.println(maxDistance(arr, n, c));

    }

}
