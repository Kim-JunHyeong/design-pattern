package com.examples.crazy.adapter;

public class AdapterImpl implements Adapter {

//    Math math;

    @Override
    public Float twiceOf(Float f) {

//        return (float) Math.twoTime(f.doubleValue());
        return Math.aDouble(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
//        log 추가
        System.out.println("절반 함수 호출 시작");
        return (float) Math.half(f.doubleValue());
    }
}
