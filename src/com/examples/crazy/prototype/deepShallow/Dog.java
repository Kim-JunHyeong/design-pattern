package com.examples.crazy.prototype.deepShallow;

public class Dog implements Cloneable {

    private String name;
    private Age age;

    public Dog copy() throws CloneNotSupportedException {

        Dog ret = (Dog) this.clone();
        ret.setAge(new Age(this.age.getYear(), this.age.getValue()));

        return ret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }
}
