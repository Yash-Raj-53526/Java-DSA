package JavaCollectionFramework;

public class Student {
    public String name;
    public int rollno;
    public String sec;

   public Student(String name, int rollno , String sec ){
        this.name = name;
        this.rollno = rollno;
        this.sec = sec;
    }
    

    public String toString(){
        return " { " + name +" , "+ rollno +" , "+ sec +" } "; 
    }


}
