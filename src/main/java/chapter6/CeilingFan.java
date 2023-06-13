package src.main.java.chapter6;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("속도 HIGH");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("속도 MEDIUM");
    }

    public void low() {
        speed = LOW;
        System.out.println("속도 LOW");
    }

    public void off() {
        speed = OFF;
        System.out.println("꺼짐!");
    }

    public int getSpeed() {
        return speed;
    }

}
