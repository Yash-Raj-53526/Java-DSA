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


//-----------------------------------------------------------------------------------------------


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
    void circumference(){
        System.out.println("Circumference of Circle: " + (2 * 3.14 * radius));
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
    void perimeter(){
        System.out.println("Perimeter of rectangle is: "+ (2*(length+width)));
    }
}


public class MAIN {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        circle.circumference();
        circle.area();
        rectangle.area();
        rectangle.perimeter();
    }
    //Vehicle is an abstract class that cannot be instantiated directly. 
    // It serves as a blueprint for the Car and Bike classes, 
    // which provide specific implementations of the start() method. 
    // The display() method is inherited by both Car and Bike, 
    // allowing them to display their brand information.
}