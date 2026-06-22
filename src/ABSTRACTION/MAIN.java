package ABSTRACTION;

abstract class Vehicle{
    String Brand;
    Vehicle(String Brand){
        this.Brand = Brand;
    }

    void display(){
        System.out.println("Brand: " + Brand);
    }

    abstract void start();

   
}

class Car extends Vehicle{
    Car(String Brand){
        super(Brand);
    }
    
    void start(){
        System.out.println("Car is starting with a key.");
    }
   
    
}

class Bike extends Vehicle{
    Bike(String Brand){
        super(Brand);
    }
    
    void start(){
        System.out.println("Bike is starting with a button.");
    }
    
   
}


abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    
    void area(){
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape{
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    void area(){
        System.out.println("Area of Rectangle: " + (length * width));
    }
}
public class MAIN {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.area();
        rectangle.area();
    }

   
    //Vehicle is an abstract class that cannot be instantiated directly. 
    // It serves as a blueprint for the Car and Bike classes, 
    // which provide specific implementations of the start() method. 
    // The display() method is inherited by both Car and Bike, 
    // allowing them to display their brand information.

}