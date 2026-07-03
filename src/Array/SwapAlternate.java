package Array;
import java.util.Arrays;

public class SwapAlternate {
    public static int[] SwapAlternate(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 7, 4, 9, 0, 1, 8};
        int swapped[] = SwapAlternate(arr);
        System.out.println("Array after swapping alternate elements: " + Arrays.toString(swapped));
    }
}
