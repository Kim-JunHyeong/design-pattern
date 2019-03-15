package com.examples.crazy.decorator.concrete;

import com.examples.crazy.decorator.abst.IBeverage;

// Role : ConcreteComponent
// Component의 실질적인 인스턴스의 부분이며, 책임의 주체입니다.
public class Base implements IBeverage {

    @Override
    public int getTotalPrice() {
        return 0;
    }
}
