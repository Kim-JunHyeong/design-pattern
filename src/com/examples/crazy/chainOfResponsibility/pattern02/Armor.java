package com.examples.crazy.chainOfResponsibility.pattern02;

public class Armor implements Defense {

    private Defense nextDefense;
    private int def;

    public  Armor() {}

    public  Armor(int def) {
        this.def = def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public void defense(Attack attack) {

        /** Point!!
         * 책임 사슬 패턴에서는 하나의 객체만 그 책임을 주지 않아도 되는 것
         * 여러가지 객체가 책임을 다 같이 지는 것
         */
        process(attack);

        if (nextDefense != null) {
            nextDefense.defense(attack);
        }
    }

    private void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }

    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }
}
