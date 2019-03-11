package com.examples.crazy.builder.pattern02;

public class Main {

    public static void main(String[] args) {
//        Computer computer = new Computer("", "", ""); -> 가독성이 좋지 않음
        Computer computer = ComputerBuilder
                .startWithCpu("i7")
//              .setCpu("i7")
                .setRam("8g")
                .setStorage("128g ssd")
                .build();

        System.out.println(computer);
    }
}
