package src.main.java.chapter11.no1;

public class GumballMachine {

    String location;
    int count;
    String state;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public String getState() {
        return state;
    }
}
