package Array;

public class Rotate2DArray {
    public static int[][] rotate(int[][] matrix, int N) {

        for (int row = 0; row < N; row++) {
            for (int col = row + 1; col < N; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        // now reverse
        for (int row = 0; row < N; row++) {
            int start = 0;
            int end = N - 1;
            while (start < end) {
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
                start++;
                end--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] result = rotate(matrix, 3);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
