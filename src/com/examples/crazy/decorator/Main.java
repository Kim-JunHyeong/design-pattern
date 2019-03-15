package com.examples.crazy.decorator;

import com.examples.crazy.decorator.abst.IBeverage;
import com.examples.crazy.decorator.concrete.Base;
import com.examples.crazy.decorator.concrete.Espresso;
import com.examples.crazy.decorator.concrete.Milk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // base
        IBeverage berverage = new Base();
        boolean done = false;

        while (!done) {
            System.out.println("음료 현재 가격 : " + berverage.getTotalPrice());
            System.out.println("선택 : (0) 주문 (1) 샷 추가 (2) 우유 추가");
            switch (scanner.nextInt()) {
                case 0 :
                    done = true;
                    break;
                case 1 :
                    berverage = new Espresso(berverage);
                    break;
                case 2 :
                    berverage = new Milk(berverage);
                    break;
            } // switch end
        } // while end

        System.out.println("음료 가격 : " + berverage.getTotalPrice());
        scanner.close();
    }
}
