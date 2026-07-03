package Array;

public class PrintAlternate {
    public static void PrintAlternate(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.print(arr[i] + " ");
                return;
            } else {
                // i < j
                System.out.print(arr[i] + " ");
                System.out.print(arr[j] + " ");
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        PrintAlternate(arr);
    }
}
