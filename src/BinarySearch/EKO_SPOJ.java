package BinarySearch;

public class EKO_SPOJ {

    public static boolean isPossible(int trees[], int m, int maxHeight) {
        int woodCollected = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > maxHeight) {
                woodCollected += trees[i] - maxHeight;
            }
        }
        if (woodCollected >= m) {
            return true;
        } else {
            return false;
        }
    }

    public static int maxWood(int trees[], int m) {
        int sum = 0;
        int n = trees.length;
        for (int i = 0; i < n; i++) {
            sum += trees[i];
        }
        int start = 0;
        int end = sum;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(trees, m, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] trees = { 20, 15, 10, 17 };
        int m = 7;
        System.out.println(maxWood(trees, m));

    }

}
