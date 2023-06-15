package src.main.java.chapter8.no2;

public interface CaffeineBeverage {

    //☆★☆★☆★☆★☆★☆★ 템플릿 메서드 ☆★☆★☆★☆★☆★☆★ : 카페인 음료를 만드는 알고리즘의 템플릿 역할을 하는 메서드
    //인터페이스로 구현했을 때 단점 : final 선언하지 못해 구현클래스에서 재정의가 가능하다 (추상클래스의 추상메서드는 서브클래서에서 재정의 불가!!)
    //할리우드 원칙(구성요소의 쓰임을 고수준 구성 요소가 결정)을 활용해 의존성 부패(고수준/저수준이 서로 의존한 복잡한 상황)`  방지
    default void prepareRecipe() {
        boilWater();        //default 메서드로 생성하여 구현클래스에서 별도 구현 없음
        brew();             //public 메서드로 생성하여 구현클래스에서 별도 구현 필요
        pourInCup();        //default 메서드로 생성하여 구현클래스에서 별도 구현 없음
        addCondiments();    //public 메서드로 생성하여 구현클래스에서 별도 구현 필요
        additionalStep();   //default 메서드로 생성하였으나 구현클래스에서 구현 해도 그만 안해도 그만
    }

    //장점1 : 알고리즘이 인터페이스에 모여있어서 수정시 인터페이스만 고치면 된다
    //장점2 : 구현클래스에서 코드 재사용이 가능하다(default 메서드)
    //장점3 : 음료 추가가 쉽다

    //☆★☆★☆★☆★☆★☆★ 알고리즘의 각 단계 ☆★☆★☆★☆★☆★☆★ : 메서드로 표현
    void brew();

    void addCondiments();

    default void boilWater() {
        System.out.println("물을 보글보글 끓이는 중...!");
    }

    default void pourInCup() {
        System.out.println("컵에 콸콸 따르는 중...!");
    }

    // Hook : 인터페이스에 선언되지만 1. 아무 코드가 없거나 2. 기본적인 내용만 구현
    // 용도 : 1. 일부 구현클래스에서만 구현을 해야할 때 2.
    default void additionalStep() {

    }

}


//템플릿 메서드 패턴이란?
//알고리즘의 골격을 정의 = 알고리즘의 템플릿(틀)을 메서드로 정의한다.
//템플릿 메서드를 사용하면 알고리즘의 일부 단계를 서브클래스에서 구현할 수 있으며,
//알고리즘의 구조는 그대로 유지하면서 알고리즘의 특정 단계를 서브클래서에서 재정의 할 수 있다