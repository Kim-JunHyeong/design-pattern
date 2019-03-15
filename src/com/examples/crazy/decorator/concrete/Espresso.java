package com.examples.crazy.decorator.concrete;

import com.examples.crazy.decorator.abst.AbstAdding;
import com.examples.crazy.decorator.abst.IBeverage;

// Role : ConcreteDecorator
// 실질적인 장식 인스턴스 및 정의이며, 책임이 추가되는 부분입니다.
public class Espresso  extends AbstAdding {

    static protected int espressoCount = 0;

    public Espresso(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getAddPrice();
    }

    /**
     * 에스프레소 추가 가격
     */
    private static int getAddPrice() {
        espressoCount += 1;
        int addPrice = 100;

        if(espressoCount > 1) {
            addPrice = 70;
        }
        return  addPrice;
    }
}
