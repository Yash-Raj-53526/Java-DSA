package Array;

public class CountZeroNOne {
    public static int[] countZeroNOne(int arr[]) {
        int ZeroCount = 0;
        int OneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ZeroCount++;
            } else if (arr[i] == 1) {
                OneCount++;
            }
        }
        int ans[] = {ZeroCount, OneCount};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 7, 4, 9, 0, 1, 8};
        int zeroOne[] = countZeroNOne(arr);
        System.out.println("Count of 0's is: " + zeroOne[0]);
        System.out.println("Count of 1's is: " + zeroOne[1]);
    }
}
