package com.examples.crazy.chainOfResponsibility.pattern02;

public class Main {

    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(15);

        armor1.setNextDefense(armor2);

        // 첫 번째 공격
        armor1.defense(attack);

        System.out.println(attack.getAmount());

        /** Point 2
         * 동적으로 책임을 추가하기
         */
        Defense defense = attack1 -> {
            int amount = attack1.getAmount();
            attack1.setAmount(amount - 50);
        };

        // 추가 착용, 첫 공격을 받았을 때 75의 데미지가 들어감
        armor2.setNextDefense(defense);
        // 공격력을 다시 100으로 설정
       attack.setAmount(100);
        // 두 번째 공격을 받을 때는 추가로 착용한 방어구로 인해 25의 데미지가 들어옴
        armor1.defense(attack);

        System.out.println(attack.getAmount());
    }
}
