package Array;

public class FindMaxMin {
    public static void main(String[] args) {
        int arr[] = {34, 1, 0, 98, 23};
        int n = arr.length;

        // find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);

        // min
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}
