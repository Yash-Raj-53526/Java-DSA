import java.util.*;

public class Array2 {
    public static double getAvg(int arr[]){
        double sum = 0;
        for(int i:arr){
            sum = sum+i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    public static boolean target(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static int getMax(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] multiplyByTen(int arr[]){
        int size = arr.length;
        int newArr[] = new int[size];
        for(int i = 0; i < size; i++){
            int element = arr[i];
            int newElement = element*10;
            newArr[i] =newElement;
        }
        return newArr;
    }

    public static int[] getPositiveNegativeSum(int arr[]){
        int posSum = 0;
        int NegSum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                posSum = posSum + arr[i];
            }else{
                NegSum = NegSum + arr[i];
            }
        }
        int ans[] = {posSum, NegSum};
        return ans;
    }

    public static int[] countZeroNOne(int arr[]){
        int ZeroCount = 0;
        int OneCount  = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                ZeroCount++;
            }else if(arr[i] == 1){
                OneCount++;
            }
        }
        int ans[] = {ZeroCount, OneCount};
        return ans;
    }

    public static int[] SwapAlternate(int arr[]){
        for(int i = 0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

    public static int[] intersection(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[Math.min(n, m)];
        int k = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(arr1[i] == arr2[j]){
                    ans[k] = arr1[i];
                    k++;
                    break;
                }
            }
        }
        return Arrays.copyOf(ans, k);
    }

    public static void main(String[] args) {
        int arr[] = {3,5,2,7,4,9,0,1,8};
        int arr1[] = {3,5,2,7,4,9,0,1,8};
        int arr2[] = {3,5,6,3,3,4,9,0,1};
        // int arr2[] = multiplyByTen(arr);

        // int sum[] = getPositiveNegativeSum(arr);
        // int posSum = sum[0];
        // int negSum = sum[1];
        // System.out.println("Positive sum is: " + posSum);
        // System.out.println("Negative sum is: " + negSum);

        //System.out.println("Array after multiplying by 10: " + Arrays.toString(arr2));

        //System.out.println("Average of array is: "+ getAvg(arr));

        //System.out.println("Target found: " + target(arr, 3));

        //System.out.println("Maximum element in array is: " + getMax(arr));

        // int zeroOne[] = countZeroNOne(arr);
        // System.out.println("Count of 0's is: " + zeroOne[0]);
        // System.out.println("Count of 1's is: " + zeroOne[1]);

        // int swapped[] = SwapAlternate(arr);
        // System.out.println("Array after swapping alternate elements: " + Arrays.toString(swapped));

        int inter[] = intersection(arr1, arr2);
        System.out.println("Intersection of two arrays is: " + Arrays.toString(inter));


    }   
    
}