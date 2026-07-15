package BinarySearch;

public class matrix2D {
    // search element in 2 d matrix with binary search

    // mid/totalCol = rowIndex
    // mid%totalCol = colIndex

    public static int search(int matrix[][], int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n * m - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / m;// the "/" diveides the total number of elements by the number of
                              // columns to get the row number
            int col = mid % m;// the "%" gives the remainder which is the column number
            if (matrix[row][col] == target) {
                return mid;
            } else if (matrix[row][col] < target) { // if the middle element is smaller than the target then we move to
                                                    // the right
                start = mid + 1;
            } else { // if the middle element is greater than the target then we move to the left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 5;
        System.out.println(search(matrix, target));
    }

}
