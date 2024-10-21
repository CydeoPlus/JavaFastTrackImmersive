package day04;

import java.util.ArrayList;
import java.util.List;

public class FoodRunner {
    public static void main(StringCharactersFrequency[] args) {
        Food pizza = new Pizza(); //upcasting
        Pizza pizza2 = new Pizza(); //no casting
        Food pizza3 = pizza2; //upcasting

        pizza.prepare();
        //pizza.cut(6); cannot access because reference is Food

        //downcasting:
        Food food = new Burger();
        food.prepare();
        ((Burger)food).addTopping("cheese"); //downcasting
        Burger burger = (Burger)food; //downcasting. Parent to child
        burger.prepare();
        burger.addTopping("tomatoes");

        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food());
        foodList.add(new Burger());
        foodList.add(new Pizza());

        for(Food myFood : foodList) {
            System.out.println("=============");
            myFood.prepare();

            if (myFood instanceof Burger) {
                ((Burger)myFood).addTopping("Cheese");//downcasting
            } else if (myFood instanceof Pizza) {
                ((Pizza) myFood).cut(6); //downcasting
            }
        }

        System.out.println("Today i would like for lunch:");
        //burger
        //pizza
        //Food
        //Steak
        Food myLunch = new Burger();

        //class cast exception
        Pizza myPizza = (Pizza)myLunch;


    }
}
