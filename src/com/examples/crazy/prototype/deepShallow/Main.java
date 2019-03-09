package com.examples.crazy.prototype.deepShallow;

// 깊은 복사와 얕은 복사
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        /*
         * 얕은 복사
         */
        System.out.println("=== 얕은 복사 ===");
        Cat navi = new Cat();
        navi.setName("navi");

        Cat yo = navi;
        yo.setName("yo");

        System.out.println(navi.getName());
        System.out.println(yo.getName());

        /*
        * 깊은 복사
         */
        System.out.println("=== 깊은 복사 ===");
        Dog happy = new Dog();

        happy.setName("happy");
        happy.setAge(new Age(2017, 3));

        Dog ohsun = happy.copy();

        ohsun.setName("ohsun");
//        happy.setAge(new Age(2019, 1)); // 제대로 설정 됨
        // 제대로 설정이 되지 않음!!함 => Dog 클래스의 copy 에서 명시적으로 깊은 복사를 설정해주어야
        ohsun.getAge().setYear(2019);
        ohsun.getAge().setValue(1);

        System.out.println(happy.getName());
        System.out.println(ohsun.getName());

        System.out.println("해피의 생일 : " + happy.getAge().getYear());
        System.out.println("오순의 생일 : " + ohsun.getAge().getYear());

        System.out.println("해피의 나이 : " + happy.getAge().getValue());
        System.out.println("오순의 나이 : " + ohsun.getAge().getValue());
    }
}
