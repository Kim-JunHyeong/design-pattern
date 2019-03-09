package com.examples.crazy.prototype;

// 자바의 경우 명시적으로 이미 인터페이스로 구현이 되어 있다.
public class Shape implements Cloneable{


//    Object 클래스에 이미 clone 라는 클래스가 정의되어 있다.
//    단, Cloneable 을 구현해야함
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
