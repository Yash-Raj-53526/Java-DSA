package BinarySearch;

public class BookAllocation {

    public static boolean isValid(int arr[], int n, int m, int maxPages) {
        int pages = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxPages) {
                return false;
            }
            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {
                count++;
                pages = arr[i];
            }
        }
        return count > m ? false : true;
    }

    public static int AllocatedBooks(int arr[], int n, int m) {

        if (m > n) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int ans = -1;
        int st = 0;
        int end = sum;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isValid(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4 };
        int n = arr.length;
        int m = 2;
        System.out.println(AllocatedBooks(arr, n, m));
    }

}
