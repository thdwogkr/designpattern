package src.main.java.chapter8.no3;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        Duck[] ducks = {
                new Duck("15살 재학", 58),
                new Duck("20살 재학", 80),
                new Duck("23살 재학", 72),
                new Duck("30살 재학", 90),
                new Duck("33살 재학", 95),
                new Duck("34살 재학", 89),
        };

        System.out.println("[정렬전] : ");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("[정렬 후] :");
        display(ducks);



    }


    public static void display(Duck[] ducks) {
        Arrays.stream(ducks).forEach(s -> System.out.println(s.toString()));
    }

}
