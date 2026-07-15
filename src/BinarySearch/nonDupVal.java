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
                if (arr[mid] == arr[mid + 1]) { // we check the right one because its the even position and the next one
                                                // is the same so single num is in right half
                    s = mid + 2;
                } else { // if we get here it means the next number is different so single num is in left
                         // half
                    e = mid;
                }
            } else { // mid is odd
                if (arr[mid] == arr[mid - 1]) { // we check the left one because its the odd position and the previous
                                                // one is the same so single num is in right half
                    s = mid + 1;
                } else { // if we get here it means the previous number is different so single num is in
                         // left half
                    e = mid - 1;
                }
            }
            // logic - if single num is present at the mid then we return it otherwise we
            // check
            // the next two adjacent elements and check if mid is even or odd
            // if mid is even then arr[mid] == arr[mid + 1] then single num is in right half
            // else single num is in left half
            // if mid is odd then arr[mid] == arr[mid - 1] then single num is in right half
            // else single num is in left half
        }

        return s;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4 };
        System.out.println(singleNonDuplicate(arr));
    }

}
