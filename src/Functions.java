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
        
    public static void checkPrime(int n){
        if(n < 2){
            System.out.println("Not Prime!");
            return;
        }
        for(int i = 2; i<= n-1; i++){
            if(n % i == 0){
                System.out.println("Not Prime!");
                return;
            }
        }
        System.out.println("Prime!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        checkPrime(n);
        
    }
}
