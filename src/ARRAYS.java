import java.util.*;

public class ARRAYS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // input and output of an array   
        // System.out.print("Enter the size of the array:");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of the array:");
        
        // //input
        // for (int i = 0; i < n; i++) {
        //     System.out.print("Element " + (i + 1) + ": ");
        //     arr[i] = sc.nextInt();
        // } 

        // //output
        // System.out.println("The elements of the array are:");
        // for (int i = 0; i < n; i++) {
        //     System.out.println("Element " + (i + 1) + ": " + arr[i]);
        // }
    

        // int arr[] = {34,1,0,98,23};
        // int n = arr.length;
        // //find the maximum element in the array
        // int max = arr[0];
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        // System.out.println("The maximum element in the array is: " + max);
        // //min
        // int min = arr[0];
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] < min) {
        //         min = arr[i];
        //     }
        // }
        // System.out.println("The minimum element in the array is: " + min);
    


    // find index of an element in an array
        // System.out.print("Enter the size of the array:");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of the array:");
        // //input
        // for (int i = 0; i < n; i++) {
        //     System.out.print("Element " + (i + 1) + ": ");
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Enter the element to find its index:");
        // int target = sc.nextInt();
        // int index = -1; // Initialize index to -1 to indicate not found
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == target) {
        //         index = i; // Update index if target is found
        //         break; // Exit the loop once the target is found
        //     }
        // }
        // if (index != -1) {
        //     System.out.println("Index of " + target + " is: " + index);
        // } else {
        //     System.out.println("Element " + target + " not found in the array.");
        // }


    //2-d array
        // System.out.print("Enter the number of rows:");
        // int rows = sc.nextInt();
        // System.out.print("Enter the number of columns:");
        // int cols = sc.nextInt();
        // int[][] arr = new int[rows][cols];
        // System.out.println("Enter the elements of the 2D array:");

        // //input
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print("Element at (" + i + ", " + j + "): ");
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // //output
        // System.out.println("The elements of the 2D array are:");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println(); // Move to the next line after each row
        // }


        //print indices 
        // System.out.println("Enter the element to find its indices:");
        // int n = sc.nextInt();
        // for (int i = 0; i < rows; i++) {    
        //     for (int j = 0; j < cols; j++) {
        //         //compare with n
        //         if (arr[i][j] == n) {
        //             System.out.println("Element " + n + " found at index (" + i + ", " + j + ")");
        //         }
        //     }
        // }

        //print data 
        // System.out.print("Enter the row of the element: ");
        // int r = sc.nextInt();
        // System.out.print("Enter the column of the element: ");
        // int c = sc.nextInt();
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (r == i && c == j) {
        //             System.out.println("Element at index (" + r + ", " + c + ") is: " + arr[i][j]);
        //         }
        //     }
        // }

        //sum of all elements in the 2D array
        // int sum = 0;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         sum += arr[i][j];
        //     }
        // }
        // System.out.println("Sum of all elements in the 2D array is: " + sum);


        //sum of each row
        // for (int i = 0; i < rows; i++) {
        //     int rowSum = 0;
        //     for (int j = 0; j < cols; j++) {
        //         rowSum += arr[i][j]; 
        //     }
        //     System.out.println("Sum of row " + i + " is: " + rowSum);
        // }


        //product of all elements in the 2D array
        // int product = 1;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         product *= arr[i][j];
        //     }
        // }
        // System.out.println("Product of all elements in the 2D array is: " + product);


        //product of each column
        // for (int j = 0; j < cols; j++) {
        //     int colProduct = 1;
        //     for (int i = 0; i < rows; i++) {
        //         colProduct *= arr[i][j];
        //     }
        //     System.out.println("Product of column " + j + " is: " + colProduct);
        // }    

        //product of each row
        // for (int i = 0; i < rows; i++) {
        //     int rowProduct = 1;
        //     for (int j = 0; j < cols; j++) {
        //         rowProduct *= arr[i][j];
        //     }
        //     System.out.println("Product of row " + i + " is: " + rowProduct);
        // }

        //find max and min in 2D array
        // int max = arr[0][0];
        // int min = arr[0][0];
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (arr[i][j] > max) {
        //             max = arr[i][j];
        //         }
        //         if (arr[i][j] < min) {
        //             min = arr[i][j];
        //         }    
        //     }
        // }
        // System.out.println("The maximum element in the 2D array is: " + max);
        // System.out.println("The minimum element in the 2D array is: " + min);

        sc.close();
    }
}