package src.main.java.chapter8.no1;

public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void addLemon() {
        System.out.println("레몬을 추가");
    }

    public void pourInCup() {
        System.out.println("컵에 음료를 따른다");
    }

    public void steepTeaBag() {
        System.out.println("찻잎을 우려내는 중...!");
    }

    public void boilWater() {
        System.out.println("물을 보글보글 끓인다...!");
    }

}
