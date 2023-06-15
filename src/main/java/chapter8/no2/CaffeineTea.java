package src.main.java.chapter8.no2;

public class CaffeineTea implements CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("찻잎을 우려내는 중...!");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬을 추가하는 중...!");
    }

}
