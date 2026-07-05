
package Array;

public class SortZeroAndOnes {
    // two pointer approach
    public static int[] sort(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0 };
        int ans[] = sort(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
