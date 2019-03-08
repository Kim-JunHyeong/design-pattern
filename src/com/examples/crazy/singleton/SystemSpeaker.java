package com.examples.crazy.singleton;

public class SystemSpeaker {

    static private SystemSpeaker instance;
    private int volume;

    // 외부에서는 생성자에 접근하면 안
    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if(instance == null) {
            // 시스템 스피커와 통신할 수 있는 작업을 넣어줘도 됨
            instance = new SystemSpeaker();
            System.out.println("새로 생성");
        } else {
            System.out.println("이미 생성");
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
