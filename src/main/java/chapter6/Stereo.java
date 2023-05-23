package src.main.java.chapter6;

public class Stereo {

    String roomName;

    public Stereo(String roomName) {
        this.roomName = roomName;
    }
    public void on() {
        System.out.println("Stereo On!!!");
    }

    public void setCD() {
        System.out.println("Set CD!!!");
    }

    public void setVolume(int volume) {
        System.out.println("volume이 " + volume + " 입니다");
    }

    public void off() {
        System.out.println("Stereo Off!!");
    }


}
