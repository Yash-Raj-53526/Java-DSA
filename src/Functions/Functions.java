package Functions;

import java.util.*;

public class Functions {


    // public static void solvr(int num){
    //     //call by value
    //     System.out.println("inside solve: " +num);
    //     num = num*10;
    //     System.out.println("inside solve after modification: " +num);
    // }



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
    // public static void power(int x, int n){
    //     int result = 1;
    //     for(int i = 1; i <= n; i++){
    //         result = result * x;
    //     }
    //     System.out.println(result);
    // }   



// Write a function to find the greatest common divisor (GCD) of two numbers.   
    // public static void findGCD(int a, int b){
    //     int gcd = 1;
    //     for(int i = 1; i <= a && i <= b; i++){
    //         if(a % i == 0 && b % i == 0){
    //             gcd = i;
    //         }
    //     }        System.out.println(gcd);
    // }



//Write a program to print Fibonacci series of n terms where n is input by user using functions.
    // public static void printFibonacci(int n){
    //     int a = 0;
    //     int b = 1;
    //     for(int i = 1; i <= n; i++){
    //         System.out.print(a + " ");
    //         int nextTerm = a + b;
    //         a = b;
    //         b = nextTerm;
    //     }
    // }


// Write a function to check if a number is an Armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371.
    // public static void checkArmstrong(int n){
    //     int temp = n;
    //     int sum = 0;
    //     while(n>0){
    //         int digit = n % 10;
    //         sum = sum + (digit * digit * digit);
    //         n = n / 10;
    //     }
    //     if(sum == temp){
    //         System.out.println("It's an Armstrong number");
    //     } else {
    //         System.out.println("It's Not an Armstrong number");
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = 5;
        //solvr(num);
        //printFactorial(num);
        //checkPrime(num);
        //power(2, 5);
        //findGCD(12, 15);
        //printFibonacci(num);
        //checkArmstrong(num);
        
        sc.close();


    }
}
