package JavaCollectionFramework;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        // insertion using an instance initializer
        map1.put(1, "Yash");
        map1.put(2 , "Tripti");
        map1.put(3, "Shubh");
        System.out.println("Map 1 : " +map1);


        Map<Integer,String> map2 = new HashMap<>();
        map2.put(4 , "Riya");
        map2.put(5,"Anshika");
        System.out.println("Second Map Before :" + map2);
        map2.putAll(map1);
        System.out.println("Second Map after putAll(map1) : "+ map2);
        System.out.println("Size of second Map  " +map2.size());


        //itration in Map 
        System.out.println("\nItrating over Map : ");
        // for (Integer Key : map2.keySet()){
        //     System.out.println(Key+ " -> "+ map2.get(Key));
        // }

        for(Map.Entry<Integer,String> entry : map2.entrySet()){
            System.out.println( entry.getKey()+" -> "+entry.getValue());
        }

        Map<Integer,String> students = new LinkedHashMap<>();

        students.put(103, "Aman");
        students.put(101, "Yash");
        students.put(102, "Rahul");

        System.out.println("Students: " + students);

        System.out.println("Student 101: " + students.get(101));

        students.replace(102, "Shubh");

        System.out.println("After Replace: " + students);

        students.remove(103);

        System.out.println("After Remove: " + students);

        
        
    }
}
