package Array;
import java.util.Arrays;

public class Intersection {
    public static int[] intersection(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[Math.min(n, m)];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    ans[k] = arr1[i];
                    k++;
                    break;
                }
            }
        }
        return Arrays.copyOf(ans, k);
    }

    public static void main(String[] args) {
        int arr1[] = {3, 5, 2, 7, 4, 9, 0, 1, 8};
        int arr2[] = {3, 5, 6, 3, 3, 4, 9, 0, 1};
        int inter[] = intersection(arr1, arr2);
        System.out.println("Intersection of two arrays is: " + Arrays.toString(inter));
    }
}
