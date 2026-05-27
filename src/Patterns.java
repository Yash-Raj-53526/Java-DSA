import java.util.*;

public class Patterns {
    public static void main(String[] args) {

         //1
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= 5; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //leave one line
        System.out.println("--------------------------------");
    
        //2
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
            
        }

        //leave one line
        System.out.println("--------------------------------");

        //3(rhombus)
        for(int row = 1; row <= 5; row++){
            //print spaces
           for(int col = 1 ; col <= 5-row; col++){
                System.out.print(" ");
           }
           //print stars
           for(int col = 1; col <= 5; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
        
        System.out.println("--------------------------------");

        //4(inverted right angle triangle)
        for (int row = 1; row <= 5; row++){
            for(int col = 1; col <= 5-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        
        System.out.println("--------------------------------");

        //5 pyramid
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= 5-row; col++){
                System.out.print("  ");
            }
            for(int col = 1; col <= 2*row-1; col++){
                System.out.print("* ");
            }
        System.out.println();
        }

        System.out.println("--------------------------------");

        //6 inverted pyramid
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= row-1; col++){
                System.out.print("  ");
            }
            for(int col = 1; col <= 2*(5-row)+1; col++){
                System.out.print("* ");
            }
        System.out.println();
        }

        System.out.println("--------------------------------");
        
        //hollow square
        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(row == 1 || row == n || col == 1 || col == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        //hollow right angle triangle
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                if(col == 1 || col == row || row == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        System.out.println("--------------------------------");

        //hollow pyramid
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row; col++){
                System.out.print("  ");
            }
            for(int col = 1; col <= 2*row-1; col++){
                if(col == 1 || col == 2*row-1 || row == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        //hollow inverted pyramid
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row-1; col++){
                System.out.print("  ");
            }
            for(int col = 1; col <= 2*(n-row)+1; col++){
                if(col == 1 || col == 2*(n-row)+1 || row == 1){
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        
            
        
    }
}
