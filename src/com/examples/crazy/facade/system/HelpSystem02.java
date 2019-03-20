package com.examples.crazy.facade.system;

// `public`을 빼면 `package`에서만 접근이 가능함
class HelpSystem02 {

    public HelpSystem02() {
        System.out.println("Call Constructor : " + getClass().getSimpleName());
    }

    public void process() {
        System.out.println("Call Process : " + getClass().getSimpleName());
    }
}
