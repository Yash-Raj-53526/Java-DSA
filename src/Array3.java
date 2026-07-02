import java.util.HashMap;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Array3 {
    public static void ReverseArray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j=n-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed Array is: ");
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
    }


    public static void ShiftArray(int arr[]){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println("Shifted Array is: "); 
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
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

    public static void main(String[] args){
        int arr[] = {1, 1,1,1,1,3,3,3,2,2,6,7,7,8,8,8,5,5,5,5,5,5,2, 3, 4, 5};
        //ReverseArray(arr);
        //ShiftArray(arr);
        //PrintAlternate(arr);
        getMode(arr);

    }
    
}
 