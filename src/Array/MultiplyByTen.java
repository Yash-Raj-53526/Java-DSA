package Array;
import java.util.Arrays;

public class MultiplyByTen {
    public static int[] multiplyByTen(int arr[]) {
        int size = arr.length;
        int newArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArr[i] = newElement;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 7, 4, 9, 0, 1, 8};
        int result[] = multiplyByTen(arr);
        System.out.println("Array after multiplying by 10: " + Arrays.toString(result));
    }
}
