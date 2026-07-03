package Array;

public class GetPositiveNegativeSum {
    public static int[] getPositiveNegativeSum(int arr[]) {
        int posSum = 0;
        int NegSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posSum = posSum + arr[i];
            } else {
                NegSum = NegSum + arr[i];
            }
        }
        int ans[] = {posSum, NegSum};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 7, 4, 9, 0, 1, 8};
        int sum[] = getPositiveNegativeSum(arr);
        System.out.println("Positive sum is: " + sum[0]);
        System.out.println("Negative sum is: " + sum[1]);
    }
}
