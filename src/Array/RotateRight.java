package Array;

public class RotateRight {
    public static void rotateright(int arr[], int k) {
        int n = arr.length;
        k = k % n; // in case k is greater than n
        Reverse.reverse(arr, 0, n - 1); // whole array reverse
        Reverse.reverse(arr, 0, k - 1); // reverse first k elements
        Reverse.reverse(arr, k, n - 1); // reverse remaining n-k elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.print("Before: ");
        PrintArray.printArray(arr);
        rotateright(arr, k);
        System.out.print("After:  ");
        PrintArray.printArray(arr);
    }
}
