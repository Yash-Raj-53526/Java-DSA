import java.util.*;



public class Functions {
    // public static void printFactorial(int n){        
    //     if(n < 0){
    //         System.out.println("Invalid!");
    //         return;
    //     }   
    //     //loop
    //     int factorial = 1;
    //     for(int i = n ; i >= 1 ; i--){
    //         factorial = factorial * i;
    //     }
    //     System.out.println(factorial);
    // }
        
    // public static void checkPrime(int n){
    //     if(n < 2){
    //         System.out.println("Not Prime!");
    //         return;
    //     }
    //     for(int i = 2; i<= n-1; i++){
    //         if(n % i == 0){
    //             System.out.println("Not Prime!");
    //             return;
    //         }
    //     }
    //     System.out.println("Prime!");
    // }

   // Two numbers are entered by the user, x and n. Write a function to find the value 
   // of one number raised to the power of another i.e. x.
    public static void power(int x, int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * x;
        }
        System.out.println(result);
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        power(x, n);
    }
}