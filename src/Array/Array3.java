package Array;
import java.util.HashMap;



public class Array3 {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void ShiftArray(int arr[]){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println("Shifted Array is: "); 
        printArray(arr);
    }

    public static void PrintAlternate(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i <= j){
            if(i==j){
                System.out.print(arr[i] + " ");
                return;
            }
            else{
                //i<j
                System.out.print(arr[i] + " ");
                System.out.print(arr[j] + " ");
                i++;
                j--;
            }
        }
    }


    public static void getMode(int arr[]){
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1); 
        }
        // for(int i: freq.keySet()){
        //     System.out.println(i + " -> " + freq.get(i));  
        // }
        int maxFreq = -1;
        int maxFreqKey = -1;
        for(int key:freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq > maxFreq){
                maxFreq = currentFreq;
                maxFreqKey = currentKey;
            }
        }
        System.out.println("Mode is: " + maxFreqKey + " with frequency: " + maxFreq);
    }

    public static void rotateright(int arr[], int k){
        int n = arr.length;
        k = k % n; // in case k is greater than n
        reverse(arr, 0, n-1); //whole array reverse
        reverse(arr, 0, k-1); //reverse first k elements
        reverse(arr, k, n-1); //reverse remaining n-k elements
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        
        // System.out.print("Before: ");
        // printArray(arr);
        // rotateright(arr, k);
        // System.out.print("After:  ");
        // printArray(arr);
        // System.out.println();
        //ShiftArray(arr);
        //PrintAlternate(arr);
        //getMode(arr);
    }
}
 