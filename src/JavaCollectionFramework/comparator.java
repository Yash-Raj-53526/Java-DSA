package JavaCollectionFramework;
import java.util.*;

public class comparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        //return s1.getName().compareTo(s2.getName());
        if(s1.getAge() == s2.getAge()){
            return s1.getName().compareTo(s2.getName());
        }
        return s1.getAge() - s2.getAge();
    } 
}
