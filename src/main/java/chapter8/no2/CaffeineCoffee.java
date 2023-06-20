package src.main.java.chapter8.no2;

public class CaffeineCoffee implements CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중...!");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중...!");
    }

    /*@Override
    public void additionalStep() {
        System.out.println("시나몬 가루를 촵촵 뿌린다...!");
    }*/
}
