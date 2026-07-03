package Array;
import java.util.*;

public class Array2DGetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the row of the element: ");
        int r = sc.nextInt();
        System.out.print("Enter the column of the element: ");
        int c = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (r == i && c == j) {
                    System.out.println("Element at index (" + r + ", " + c + ") is: " + arr[i][j]);
                }
            }
        }
        sc.close();
    }
}
