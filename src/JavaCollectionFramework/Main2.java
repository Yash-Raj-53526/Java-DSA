package JavaCollectionFramework;
import java.util.*;

public class Main2 {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student("John", 67, "A" , 20));
        list.add(new Student("Alice", 78, "B" , 29));
        list.add(new Student("Yash", 23, "A" , 18));
        System.out.println("List of Students: "+ list);

        Collections.sort(list);
        System.out.println("After Sorting: "+ list);
    }
    
}
