package BasicMaths;

import java.util.*;

public class BasicMaths {

    public static int reverseNum(int num){
        int reversed = 0;
        while(num > 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }
        return reversed;
    }

    public static int checkPalindrome(int num){
        int reversed = reverseNum(num);
        if(num == reversed){
            System.out.println(num + " is a palindrome."); //palindrome
            return 1;
        } else {
            System.out.println(num + " is not a palindrome."); //not palindrome
            return 0;
        }
    }

    public static int checkPrime(int num){
        if(num <= 1){
            System.out.println(num + " is not a prime number.");
            return 0;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.println(num + " is not a prime number.");
                return 0;
            }
        }
        System.out.println(num + " is a prime number.");
        return 1;

    }

    public static int checkGCD(int num1 , int num2){
        int gcd = 1 ;
        for(int i = 1; i <= Math.min(num1, num2); i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        } 
        return gcd;
    
    }

    public static int checkLCM(int num1, int num2){
        
        int lcm = (num1 * num2) / checkGCD(num1, num2);
        return lcm;
    }

    public static int checkArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        int len = String.valueOf(num).length();
        while(num > 0){
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, len);
            num /= 10;
        }
        if(sum == originalNum){
            System.out.println(originalNum + " is an Armstrong number.");
            return sum;
            
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
            return sum;
            
        }
        
    }


    public static int checkFactorial(int num){
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reversed number: " + reverseNum(num));
        checkPalindrome(num);
        checkArmstrong(num);
        checkPrime(num);
        System.out.println("Factorial of " + num + " is: " + checkFactorial(num));
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        System.out.println("GCD of " + num + " and " + num2 + " is: " + checkGCD(num, num2));
        System.out.println("LCM of " + num + " and " + num2 + " is: " + checkLCM(num, num2));
        sc.close();
    }
}
