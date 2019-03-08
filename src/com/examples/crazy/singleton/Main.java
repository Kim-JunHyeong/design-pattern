package com.examples.crazy.singleton;

public class Main {

    public static void main(String[] args) {

        SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();
        SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

        // 하나의 리소스에만 접근하는지 확인
        // 하나의 리소스를 변경하면 같은 값이 나옴
        // 5, 5
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        // 11, 11
        systemSpeaker1.setVolume(11);
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        // 22, 22
        systemSpeaker1.setVolume(22);
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        if (systemSpeaker1 == systemSpeaker2) {
            System.out.println("같은 인스턴스다!");
        }
    }
}
