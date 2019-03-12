package com.examples.crazy.abstractFactory.gt;

import com.examples.crazy.abstractFactory.abst.BikeFactory;
import com.examples.crazy.abstractFactory.abst.Body;
import com.examples.crazy.abstractFactory.abst.Wheel;

public class GtBikeFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
