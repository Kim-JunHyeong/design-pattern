package com.examples.crazy.builder.pattern02;

public class ComputerBuilder {

    private Computer computer;

    private ComputerBuilder() {
        computer = new Computer("default", "default", "default");
    }

    public static ComputerBuilder startWithCpu(String cpu) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.computer.setCpu(cpu);

        return builder;
    }

    static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    Computer build() {
        return this.computer;
    }
}
