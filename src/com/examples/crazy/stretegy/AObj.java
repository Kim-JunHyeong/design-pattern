package com.examples.crazy.stretegy;

public class AObj {

    AInterface aInterface;

    public AObj() {
        aInterface = new AInterfaceImpl();
    }

    public void funcAA() {
        // 어떤 기능을 구현할 때 그 책임을 다른 객체의 기능을 빌려서 사용하는 것 (델리게이트)
        aInterface.funcA();
        aInterface.funcA();
    }
}
