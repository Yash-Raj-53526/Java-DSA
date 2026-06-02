public class Lifecycle_in_JAVA {
    //atributes
    public String name;
    public int age;
    public String gender;
    public int id;

    //default constructor
    public Lifecycle_in_JAVA(){
        System.out.println("Default constructor called.");

    }
    //parameterized constructor
    public Lifecycle_in_JAVA(String name, int age, String gender, int id){
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;

    }

    //copy constructor
    public Lifecycle_in_JAVA(Lifecycle_in_JAVA s){
        System.out.println("Copy constructor called.");
        this.name = s.name;
        this.age = s.age;
        this.gender = s.gender;
        this.id = s.id;
    }
    

    //methods(behaviour)
    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
    public void work(){
        System.out.println(name + " is working.");
    }

}
