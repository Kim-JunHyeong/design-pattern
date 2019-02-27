package com.examples.crazy.stretegy;

public class Main {
    public static void main(String[] args) {
        AInterface aInterface = new AInterfaceImpl();

        // AInterface 는 funcA 기능을 사용할 수 있는 통로를 제공함.
        aInterface.funcA();

        // 델리게이트
        AObj aObj = new AObj();
        aObj.funcAA();

        // 전략패턴 테스트
        GameCharacter character = new GameCharacter();

        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Ax());
        character.attack();
    }

}
