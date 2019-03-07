package com.examples.crazy.factoryMethod.concrete;

import com.examples.crazy.factoryMethod.framework.Item;

public class MpPotion implements Item {

    @Override
    public void use() {
        System.out.println("마력 회복!");
    }
}
