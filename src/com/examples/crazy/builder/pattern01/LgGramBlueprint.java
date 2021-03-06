package com.examples.crazy.builder.pattern01;

public class LgGramBlueprint extends Blueprint{

    private Computer computer;

    private String cpu;
    private String ram;
    private String storage;

    public LgGramBlueprint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    void setCpu() {
//        computer.setCpu("i7");
        cpu = "i7";
    }

    @Override
    void setRam() {
//        computer.setRam("8g");
        ram = "8g";
    }

    @Override
    void setStorage() {
//        computer.setStorage("256g ssd");
        storage = "256g ssd";
    }

    @Override
    Computer getComputer() {
        return new Computer(cpu, ram, storage);
//        return computer;
    }
}
