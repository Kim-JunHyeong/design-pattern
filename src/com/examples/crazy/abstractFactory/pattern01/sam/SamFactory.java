package com.examples.crazy.abstractFactory.pattern01.sam;

import com.examples.crazy.abstractFactory.pattern01.abst.BikeFactory;
import com.examples.crazy.abstractFactory.pattern01.abst.Body;
import com.examples.crazy.abstractFactory.pattern01.abst.Wheel;

public class SamFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
