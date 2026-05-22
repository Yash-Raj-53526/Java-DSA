import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        //int n = sc.nextInt();
        // for(int i = 1; i <= 10; i++){  //(conditon, initialization, updation)
        //     System.out.println(n + " X " + i + " = " + (n * i));
        // }


        // int i = 1;
        // while(i <= 10){
        //     System.out.println(n + " X " + i + " = " + (n*i));
        //     i++;
        // }

        // int i = 1;
        // do{
        //     System.out.println(n + " X " + i + " = " + (n*i));
        //     i++;
        // }while(i <= 10);

        // do{
        //     int marks = sc.nextInt();
        //     if(marks >= 90 && marks <= 100){
        //         System.out.println("A+");
        //     } else if (marks >= 60 && marks <= 89){
        //         System.out.println("A");
        //     } else if (marks >= 0 && marks <= 59){
        //         System.out.println("B");
        //     } else {
        //         System.out.println("Invalid!");
        //     }
        //     System.out.println("Do you want to continue? (yes(1)/no(0))");
        //     n = sc.nextInt();
        // } while(n == 1);




        // for(int i = 2; i*i<=n ; i++){
        //     if(n%i == 0){
        //         System.out.println("Not Prime!");
        //         return;
        //     }
        // }
        // System.out.println("Prime!");  




        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }

        //outer loop
        // for(int i=1;i<=5;i++){
        //     //inner loop
        //     for(int j =1;j<=5;j++){
        //         //cell -> (i,j)
        //         if(i==1 || j==1 || i==5 || j==5){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i<=5;i++){
        //     for(int j = 1; j<=i;j++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }


        // for(int i =5;i>=1;i--){
        //     for(int j = 1; j<=i;j++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for(int i = 1 ; i <= n; i++){
        //     // print spaces
        //     for(int j = 1 ; j <= n-i; j++){
        //         System.out.print(" ");
        //     } 
        //     // print stars
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i <=n; i++){
        //     for(int j = 1; j<=i ; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = n ; i >= 1 ; i--){
        //     for(int j = 1; j<=i ; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(); 
        // }


        //floids triangle
        // int n = 5;
        // int number = 1;
        // for(int i = 1 ; i<= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1 ; i<=n; i++) {
        //     for(int j = 1; j <= i; j++){
        //         int sum = i + j;
        //         if(sum % 2 == 0){
        //             System.out.print("1 ");
        //         } else {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        
        

        // //butterfly pattern
        // int n = 5;
        // //1st half
        // for(int i = 1; i <=n; i++) {
        //     //1st part
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j = 1; j <= 2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     //2nd part
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //2nd half
        // for(int i = n; i >= 1; i--) {
        //     //1st part
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j = 1; j <= 2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     //2nd part
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // solid rhombus
        // int n = 5;
        // for(int i = 1 ; i <= n; i++){
        //     //spaces
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j = 1; j <= n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //number pyramid
        int n = 5;
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //numbers -> PRINT ROW NUMBER 'i', 'i' times
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
