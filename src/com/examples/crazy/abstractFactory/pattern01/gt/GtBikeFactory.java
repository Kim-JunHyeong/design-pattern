package com.examples.crazy.abstractFactory.pattern01.gt;

import com.examples.crazy.abstractFactory.pattern01.abst.BikeFactory;
import com.examples.crazy.abstractFactory.pattern01.abst.Body;
import com.examples.crazy.abstractFactory.pattern01.abst.Wheel;

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
