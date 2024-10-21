package day04;

public class Burger extends Food{
    public void prepare() {
        System.out.println("preparing burger");
    }

    public void addTopping(String topping) {
        System.out.println("adding " + topping + " to burger");
    }
}
