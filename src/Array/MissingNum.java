package Array;

import java.util.Arrays;

public class MissingNum {
    public static int missingNum(int[] nums) {
        int xorSum = 0;
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        System.out.println("Missing number in " + Arrays.toString(nums) + " is: " + missingNum(nums));
    }
}
