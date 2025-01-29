package day02.oop;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    //Encapsulation:
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            //
        }
        this.price = price;
    }

    public void drive() {
        System.out.println("Driving " + model);
    }
}
