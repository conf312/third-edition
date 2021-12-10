package com.study.thirdedition.singleton;

/**
 private 생성자는 SingletonPrivate.INSTANCE를 초기화할때 딱 한번만 호출된다.
 public이나 protected 생성자가 없으므로 INSTANCE가 하나뿐임이 보장된다.
 */
public class SingletonPublicStaticFinal {
    public static final SingletonPublicStaticFinal INSTANCE = new SingletonPublicStaticFinal();

    private SingletonPublicStaticFinal() {
        System.out.println("# SingletonPublicStaticFinal Constructor");
    }

    //private SingletonPrivate() {}
    public void leaveTheBuilding() {
        System.out.println("# SingletonPublicStaticFinal leaveTheBuilding Method");
    }
}
