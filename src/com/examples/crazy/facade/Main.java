package com.examples.crazy.facade;

import com.examples.crazy.facade.system.Facade;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();
        // sub system 의 복잡한 과정을 쉽게 구현할 수 있음
    }
}
