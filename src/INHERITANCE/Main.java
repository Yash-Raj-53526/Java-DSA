package INHERITANCE;

//single inheritance example
class animal {
    void eat(){
        System.out.println("This animal eats food.");
    }
}
class dog extends animal {
    void bark(){
        System.out.println("The dog barks.");
    }
}


//multilevel inheritance example
class A {
    void showA(){
        System.out.println("This is class A and it is the parent class.");
    }
}
class B extends A {
    void showB(){
        System.out.println("This is class B and it inherits from class A.");
    }
}
class C extends B {
    void showC(){
        System.out.println("This is class C and it inherits from class B.");
    }
}

//hierarchical inheritance example
class Parent {
    void showParent(){
        System.out.println("This is the parent class.");
    }
}
class Child1 extends Parent {
    void showChild1(){
        System.out.println("This is child class 1 and it inherits from the parent class.");
    }
}
class Child2 extends Parent {
    void showChild2(){
        System.out.println("This is child class 2 and it inherits from the parent class.");
    }
}

class LivingBeing {
    void sound(){
        System.out.println("Living being sound.");
    }
}
class Cat extends LivingBeing {
    @Override
    void sound(){
        System.out.println("Meow!");
    }
}   



public class Main {
    public static void main(String[] args) {
        //C objC = new C();
        // objC.showA(); // inherited from class A
        // objC.showB(); // inherited from class B
        // objC.showC(); // method from class C

        // Child1 objC1 = new Child1();
        // objC1.showChild1(); // method from Child1 class

        // Child2 objC2 = new Child2();
        //objC2.showChild2(); // method from Child2 class

        Cat cat = new Cat();
        cat.sound(); // Output: Meow!


    }
}
