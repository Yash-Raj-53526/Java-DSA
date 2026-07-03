package Array;

public class GetAvg {
    public static double getAvg(int arr[]) {
        double sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 7, 4, 9, 0, 1, 8};
        System.out.println("Average of array is: " + getAvg(arr));
    }
}
