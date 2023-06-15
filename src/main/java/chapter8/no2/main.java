package src.main.java.chapter8.no2;

import src.main.java.chapter8.no2.CaffeineCoffee;
import src.main.java.chapter8.no2.CaffeineTea;

public class main {

    public static void main(String[] args) {
        CaffeineCoffee caffeineCoffee = new CaffeineCoffee();
        CaffeineTea caffeineTea = new CaffeineTea();

        caffeineCoffee.prepareRecipe();
        caffeineTea.prepareRecipe();

    }
}
