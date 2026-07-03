package Array;

import java.util.*;

public class threeSum {
    public static List<List<Integer>> ThreeSum(int[] arr) {

        Set<List<Integer>> result = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println(ThreeSum(arr));
    }

}
