package day02.oop;

public class Kia extends Car {
    String model = "K5";

    public void start() {
        System.out.println("Starting Kia " + model);
    }

    public Kia() {
        super();
        System.out.println("Kia constructor");
    }
}
