package src.main.java.chapter6;

public class Light {

    String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println("Light on!!!");
    }

    public void off() {
        System.out.println("Light off!!!");
    }
}
