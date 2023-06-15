package src.main.java.chapter8.no3;

public class Duck implements Comparable<Duck> {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " 체중:" + weight;
    }

    @Override
    public int compareTo(Duck duck2) {

        if (this.weight < duck2.weight) {
            return -1;
        } else if (this.weight == duck2.weight) {
            return 0;
        }
        return 1;
    }


}
