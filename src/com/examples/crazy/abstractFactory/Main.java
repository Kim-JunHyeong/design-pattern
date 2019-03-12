package com.examples.crazy.abstractFactory;

import com.examples.crazy.abstractFactory.abst.BikeFactory;
import com.examples.crazy.abstractFactory.abst.Body;
import com.examples.crazy.abstractFactory.abst.Wheel;
import com.examples.crazy.abstractFactory.gt.GtBikeFactory;
import com.examples.crazy.abstractFactory.sam.SamFactory;

public class Main {

    public static void main(String[] args) {
        BikeFactory samFactory = new SamFactory();

        Body samBody = samFactory.createBody();
        Wheel samWheel = samFactory.createWheel();

        System.out.println(samBody.getClass());
        System.out.println(samWheel.getClass());


        BikeFactory gtFactory = new GtBikeFactory();

        Body gtBody = gtFactory.createBody();
        Wheel gtWheel = gtFactory.createWheel();

        System.out.println(gtBody.getClass());
        System.out.println(gtWheel.getClass());
    }
}
