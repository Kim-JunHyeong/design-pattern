package com.examples.crazy.builder.pattern01;

public class ComputerFactory {

    private Blueprint blueprint;

    void setBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    void make() {
        blueprint.setCpu();
        blueprint.setRam();
        blueprint.setStorage();
    }

    Computer getComputer() {
        return blueprint.getComputer();
    }
}
