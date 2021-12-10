package com.study.thirdedition.singleton;

/**
 대부분의 상황에서는 원소가 하나뿐인 열거 타입이 싱글턴을 만드는 가장 좋은 방법이다.
  단, 만들려는 싱글턴이 Enum 외에 클래스를 상속해야 한다면 이 방법은 사용할 수 없다.
 (열거 타입이 다른 인터페이스를 구현하도록 선언할 수 는 있다.)
 */
public enum SingletonEnum {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("# SingletonEnum leaveTheBuilding Method");
    }
}
