package day02.oop;
            //Kia IS-A Car
public class Kia extends Car {
    String model = "K5"; //variable hiding

    public Kia() {
        super("K5");
        System.out.println("Kia constructor");
    }

    public Kia(String model) {
        super(model); //call parent class constructor
    }

    public void start() {
        System.out.println("Starting Kia " + model);
        super.drive(); //access parent class object's variable and methods
    }

}
