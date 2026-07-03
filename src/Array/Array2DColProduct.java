package Array;
import java.util.*;

public class Array2DColProduct {
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

        // product of each column
        for (int j = 0; j < cols; j++) {
            int colProduct = 1;
            for (int i = 0; i < rows; i++) {
                colProduct *= arr[i][j];
            }
            System.out.println("Product of column " + j + " is: " + colProduct);
        }
        sc.close();
    }
}
