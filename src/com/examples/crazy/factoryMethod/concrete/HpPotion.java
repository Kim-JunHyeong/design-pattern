package com.examples.crazy.factoryMethod.concrete;

import com.examples.crazy.factoryMethod.framework.Item;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
