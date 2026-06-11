package transport;

public class vehicle {
    public String name;
    public String model;
    public int price;

    public vehicle(){
        this.name = "";
        this.model = "";
        this.price = 0;
    }

    public vehicle(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    void StartEngine(){
        System.out.println("Engine started of " + name + ".");
    }

    void StopEngine(){
        System.out.println("Engine stopped of " + name + ".");

    }
}
