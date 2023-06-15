package src.main.java.chapter8.no1;

public class Coffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가");
    }

    public void pourInCup() {
        System.out.println("컵에 음료를 따른다");
    }

    public void brewCoffeeGrinds() {
        System.out.println("필터로 커피를 우려내는 중...!");
    }

    public void boilWater() {
        System.out.println("물을 보글보글 끓인다...!");
    }
    
}
