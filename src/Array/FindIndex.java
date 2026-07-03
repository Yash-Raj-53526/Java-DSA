package Array;
import java.util.*;

public class FindIndex {
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

        System.out.print("Enter the element to find its index:");
        int target = sc.nextInt();
        int index = -1; // Initialize index to -1 to indicate not found
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i; // Update index if target is found
                break; // Exit the loop once the target is found
            }
        }
        if (index != -1) {
            System.out.println("Index of " + target + " is: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
        sc.close();
    }
}
