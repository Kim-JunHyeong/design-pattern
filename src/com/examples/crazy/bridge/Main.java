package com.examples.crazy.bridge;

public class Main {

    public static void main(String[] args) {

//        PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
        PrintMorseCode code = new PrintMorseCode(new FlashMorseCodeFunction());

//        code.g();code.a();code.r();code.a();code.m();
        code.g().a().r().a().m();
    }
}
