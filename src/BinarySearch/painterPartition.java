package BinarySearch;

public class painterPartition {

    public static boolean isValid(int arr[], int n, int m, int maxTime) {
        int time = 0;
        int count = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxTime) {
                return false;
            }
            if (time + arr[i] <= maxTime) {
                time += arr[i];
            } else {
                count++;
                time = arr[i];
            }
        }
        return count > m ? false : true;
    }

    public static int timeTaken(int arr[], int m) {
        int n = arr.length;
        int start = 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int end = sum;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int m = 2;
        System.out.println(timeTaken(arr, m));

    }

}
