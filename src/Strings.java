import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // String name = "Tony Stark";
        // // System.out.println(name.length());

        // for(int i = 0; i < name.length(); i++){
        //     System.out.println(name.charAt(i)+ " at index -> " + i);
        // }

        //compareTo method is used to compare two strings lexicographically. It returns a positive integer if the first string is greater than the second string, a negative integer if the first string is less than the second string, and 0 if both strings are equal.
        // String name1 = "Tony Stark";
        // String name2 = "Tony Stark";
        //s1 > s2 -> positive value
        //s1 < s2 -> negative value
        //s1 == s2 -> 0

        // if(name1.compareTo(name2) == 0 ){
        //     System.out.println("Strings are equal");
        // } else {    
        //     System.out.println("Strings are not equal");
        // }

        //equals() method is used to compare the content of two strings. It returns true if the content of both strings is the same, and false otherwise.
        // if(name1.equals(name2)){
        //     System.out.println("Strings are equal");
        // } else {    
        //     System.out.println("Strings are not equal");
        // }

        // String sentence = "my name is Yash Raj Pandey";
        // //.substring(beginIndex, endIndex)
        // String name = sentence.substring(11, 19);//endIndex is exclusive
        // System.out.println(name);



        //input email and print username 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.next();
        String username = email.substring(0, email.indexOf('@'));
        System.out.println("Your username is: " + username);
        sc.close();
    }
}