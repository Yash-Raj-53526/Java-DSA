package Array;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int Ls[] = new int[n];
        int Rs[] = new int[n];

        // Left sum
        Ls[0] = nums[0];
        for (int i = 1; i < n; i++) {
            Ls[i] = Ls[i - 1] + nums[i];
        }

        // Right sum
        Rs[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Rs[i] = Rs[i + 1] + nums[i];
        }

        // pivot index
        for (int i = 0; i < n; i++) {
            if (Ls[i] == Rs[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }

}
