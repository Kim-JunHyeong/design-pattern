package com.examples.crazy.chainOfResponsibility.pattern01;

public class Request {

    int a, b;
    String oprator;

    public Request(int a, int b, String oprator) {
        this.a = a;
        this.b = b;
        this.oprator = oprator;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOprator() {
        return oprator;
    }

    public void setOprator(String oprator) {
        this.oprator = oprator;
    }
}
