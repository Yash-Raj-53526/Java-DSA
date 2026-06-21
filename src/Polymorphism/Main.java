package Polymorphism;

class Animal {
    
void makeSound() {
    System.out.println("Animal makes a sound");
}

void eat() {
    System.out.println("Animal is eating");
}


}

class Dog extends Animal {

@Override
void makeSound() {
    System.out.println("Dog barks");
}

void fetch() {
    System.out.println("Dog fetches the ball");
}


}

class Cat extends Animal {

@Override
void makeSound() {
    System.out.println("Cat meows");
}

void climb() {
    System.out.println("Cat climbs a tree");
}


}

public class Main {
    
    public static void main(String[] args) {

        // ===========================
        // UPCASTING
        // ===========================

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // ===========================
        // RUNTIME POLYMORPHISM
        // ===========================

        a1.makeSound();
        a2.makeSound();

        // ===========================
        // INHERITED METHODS
        // ===========================

        a1.eat();
        a2.eat();

        // ===========================
        // DOWNCASTING + instanceof
        // ===========================

        if (a1 instanceof Dog) {
            Dog d = (Dog) a1;
            d.fetch();
        }

        if (a2 instanceof Cat) {
            Cat c = (Cat) a2;
            c.climb();
        }

        // ===========================
        // DYNAMIC METHOD DISPATCH
        // ===========================

        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();
    }
}
  

