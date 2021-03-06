package com.examples.crazy.decorator.abst;

// Role : Decorator
// 컴포넌트와 장식을 동일시 해주는 역할합니다.
abstract public class AbstAdding implements IBeverage{

    private IBeverage base;

    public AbstAdding(IBeverage base) {
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    protected IBeverage getBase() {
        return base;
    }
}
