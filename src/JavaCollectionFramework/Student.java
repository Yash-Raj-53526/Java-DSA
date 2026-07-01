package JavaCollectionFramework;

public class Student implements Comparable<Student> {
    public String name;
    public int rollno;
    public String sec;
    public int age;

    public void setName(String name){
        this.name = name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setSec(String sec){
        this.sec = sec;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
    public String getSec(){
        return sec;
    }
    public int getAge(){
        return age;
    }

   public Student(String name, int rollno , String sec , int age){
        this.name = name;
        this.rollno = rollno;
        this.sec = sec;
        this.age = age;
    }   

    public String toString(){
        return " { " + name +" , "+ rollno +" , "+ sec +" , "+ age +" }"; 
    }

    @Override
    public int compareTo(Student that){
        //sorts on the basis of roll no.
        return this.rollno - that.rollno;

    }
}
