package com.study.thirdedition.singleton;

/**
 getInstance()은 항상 같은 객체의 참조를 반환하므로 제2의 인스턴스란 결코 만들어지지 않는다.
 */
public class SingletonStaticFactoryPattern {
    private static final SingletonStaticFactoryPattern INSTANCE = new SingletonStaticFactoryPattern();

    private SingletonStaticFactoryPattern() {
        System.out.println("# SingletonStaticFactoryPattern Constructor");
    }

    public static SingletonStaticFactoryPattern getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("# SingletonStaticFactoryPattern leaveTheBuilding Method");
    }
    
    // 직렬화할때 싱글턴임을 보장해주는 메서드
    // 아직 미구현 12장 직렬화 이후 구현
    private Object readResovle() {
        return INSTANCE;
    }
}
