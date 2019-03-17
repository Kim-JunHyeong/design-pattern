package com.examples.crazy.chainOfResponsibility;

public class PlusCalculator extends Calculator {

    @Override
    protected boolean operator(Request request) {
        if (request.getOprator().equals("+")) {

            int a = request.getA();
            int b = request.getB();
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
        return false;
    }
}
