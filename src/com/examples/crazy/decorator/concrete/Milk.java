package com.examples.crazy.decorator.concrete;

import com.examples.crazy.decorator.abst.AbstAdding;
import com.examples.crazy.decorator.abst.IBeverage;

// 실질적인 장식 인스턴스 및 정의이며, 책임이 추가되는 부분입니다.
public class Milk extends AbstAdding {

    public Milk(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }
}
