package com.examples.crazy.factoryMethod;

import com.examples.crazy.factoryMethod.concrete.HpCreator;
import com.examples.crazy.factoryMethod.concrete.MpCreator;
import com.examples.crazy.factoryMethod.framework.Item;
import com.examples.crazy.factoryMethod.framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}
