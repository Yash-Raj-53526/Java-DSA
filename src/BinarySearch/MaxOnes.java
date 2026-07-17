package BinarySearch;

public class MaxOnes {
    public static int FirstOccurrence(int arr[][], int rowIndex) {
        int TotalCol = arr[0].length;
        int ans = -1;
        if (arr[rowIndex][TotalCol] == 0) {
            return TotalCol;
        } else {
            int s = 0;
            int e = TotalCol - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[rowIndex][mid] == 0) {

                    s = mid + 1;
                } else {
                    ans = mid;
                    e = mid - 1;
                }
            }
        }
        return ans;
    }

    public static int maxOnes(int arr[][]) {
        int TotalRow = arr.length;
        int TotalCol = arr[0].length;
        int maxOneCount = -1;
        int maxOneRow = -1;
        for (int row = 0; row < TotalRow; row++) {
            int firstIndex = FirstOccurrence(arr, row);
            int CurrentCount = TotalCol - firstIndex;

            if (CurrentCount > maxOneCount) {
                maxOneCount = CurrentCount;
                maxOneRow = row;
            }

        }
        return maxOneRow;
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 1, 1 },
                { 0, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };

        System.out.println(maxOnes(arr));
    }
}
