package com.examples.crazy.decorator.abst;

// Role : Component
// 컴포넌트는 실질적인 컴포넌트들을 다루는, 컨트롤하는 역할
public interface IBeverage {

    /**
     * 총 가격
     */
    int getTotalPrice();
}
