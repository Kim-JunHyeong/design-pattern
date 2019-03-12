package com.examples.crazy.abstractFactory.sam;

import com.examples.crazy.abstractFactory.abst.BikeFactory;
import com.examples.crazy.abstractFactory.abst.Body;
import com.examples.crazy.abstractFactory.abst.Wheel;

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
