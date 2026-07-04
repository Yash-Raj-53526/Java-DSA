package Array;

import java.util.*;

public class findMissing {
    public static List<Integer> find(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (arr[val - 1] > 0) {
                arr[val - 1] *= -1;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 5, 5, 4 };
        System.out.println(find(arr));
    }
}
