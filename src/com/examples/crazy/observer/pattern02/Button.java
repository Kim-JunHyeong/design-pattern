package com.examples.crazy.observer.pattern02;

import java.util.Observable;

// java 는 다중상속이 안된다. 따라서 Observable 클래스를 상속받아서 사용하기는 좀 어렵다.
public class Button extends Observable {

    public void onClick() {
        setChanged();
        notifyObservers();
    }
}
