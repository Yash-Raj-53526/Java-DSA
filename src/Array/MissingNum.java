package Array;

public class MissingNum {
    public int MissingNum(int[] nums) {
        int xorSum = 0;
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }

    }

}
