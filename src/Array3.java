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
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        //ReverseArray(arr);
    }
    
}
 