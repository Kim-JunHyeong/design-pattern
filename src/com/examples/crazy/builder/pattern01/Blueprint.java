package com.examples.crazy.builder.pattern01;

public abstract class Blueprint {

    abstract void setCpu();
    abstract void setRam();
    abstract void setStorage();

    abstract Computer getComputer();
}
