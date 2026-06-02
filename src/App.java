import java.util.*;

public class App {
     public static void main(String[] args){
         //Scanner sc = new Scanner(System.in);

        //  Lifecycle_in_JAVA s1 = new Lifecycle_in_JAVA();
        //  s1.name = "John";
        //  s1.age = 25;
        //  s1.gender = "Male";
        //  s1.id = 12345; 

        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // System.out.println(s1.gender);
        // System.out.println(s1.id);
        // s1.eat();
        // s1.sleep();

        //parameterized constructor
        Lifecycle_in_JAVA s2 = new Lifecycle_in_JAVA("Alice", 30, "Female", 54321);
        // System.out.println(s2.name);
        // System.out.println(s2.age);
        // System.out.println(s2.gender);
        // System.out.println(s2.id);  
        // s2.work();

        //copy constructor
        Lifecycle_in_JAVA s3 = new Lifecycle_in_JAVA(s2);  
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.gender);
        System.out.println(s3.id);
        s3.sleep();
        


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
         // int n = 5;
         // for(int i = 1; i <= n; i++){
         //     //spaces
         //     for(int j = 1; j <= n-i; j++){
         //         System.out.print(" ");
         //     }
         //     //numbers -> PRINT ROW NUMBER 'i', 'i' times
         //     for(int j = 1; j <= i; j++){
         //         System.out.print(i+" ");
         //     }
         //     System.out.println();
         // }


         //palindromic pattern
         // int n = 5;
         // for(int i = 1 ; i <= n; i++){
         //     //spaces
         //     for(int j = 1; j <= n-i; j++){
         //         System.out.print(" ");
         //     }
         //     //numbers -> print decreasing order
         //     for(int j = i; j >= 1; j--){
         //         System.out.print(j);
         //     }
         //     //numbers -> print increasing order
         //     for(int j = 2; j <= i; j++){
         //         System.out.print(j);
         //     }
         //     System.out.println();

         // }

         //diamond pattern
         // int n = 5;
         // //1st half
         // for(int i = 1; i<=n; i++){
         //     //spaces
         //     for(int j = 1;j <= n-i; j++){
         //         System.out.print(" ");
         //     }
         //     //stars
         //     for(int j = 1; j <= 2*i-1; j++){
         //         System.out.print("*");
         //     }
         //     System.out.println();
         // }
         // //2nd half
         // for(int i = n; i >= 1; i--){
         //     //spaces
         //     for(int j = 1; j <= n-i; j++){
         //         System.out.print(" ");
         //     }
         //     //stars
         //     for(int j = 1; j <= 2*i-1; j++){
         //         System.out.print("*");
         //     }
         //     System.out.println();
         // }
         //sc.close();

    }
}
