package src.main.java;

import src.main.java.chapter6.Light;
import src.main.java.chapter6.LightOnCommand;

public class DesignPattern {

    public static void main(String[] args) {

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        lightOnCommand.execute();

    }
}
