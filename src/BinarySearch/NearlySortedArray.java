package BinarySearch;

public class NearlySortedArray {
    public static int search(int arr[], int tar) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (arr[mid - 1] >= start && arr[mid - 1] == tar) {
                return mid - 1;
            }
            if (arr[mid + 1] <= end && arr[mid + 1] == tar) {
                return mid + 1;
            }
            if (arr[mid] > tar) {
                start = mid + 2;
            } else {
                end = mid - 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 3, 40, 20, 50, 80, 70 };
        int n = arr.length;
        int target = 40;
        System.out.println(search(arr, target));
    }

}

// time complexity O(logN)
// space complexity O(1)