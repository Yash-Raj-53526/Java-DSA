package Array;
import java.util.*;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        // input
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // output
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
        sc.close();
    }
}
