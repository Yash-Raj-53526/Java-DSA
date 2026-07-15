package BinarySearch;

public class nonDupVal {
    // find single non duplicate value in sorted array
    public static int singleNonDuplicate(int arr[]) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s < e) {

            if (s == e) {
                return arr[s];
            }
            int mid = s + (e - s) / 2;
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    s = mid + 2;
                } else {
                    e = mid;
                }
            } else { // mid is odd
                if (arr[mid] == arr[mid - 1]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return s;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4 };
        System.out.println(singleNonDuplicate(arr));
    }

}
