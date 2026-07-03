package Array;

public class Target {
    public static boolean target(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 7, 4, 9, 0, 1, 8};
        System.out.println("Target found: " + target(arr, 3));
    }
}
