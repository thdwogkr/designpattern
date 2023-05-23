package src.main.java.chapter6;

public class GarageDoor {

    String roomName;

    public GarageDoor(String roomName) {
        this.roomName = roomName;
    }

    public void up() {
        System.out.println("Garage Door Up!");
    }

    public void down() {
        System.out.println("Garage Door Down!");
    }
}
