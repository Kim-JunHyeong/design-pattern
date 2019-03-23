package com.examples.crazy.observer.pattern03;

import com.examples.crazy.observer.pattern03.Observable.Observer;

public class Button {

    public Button() {
        observable = new Observable<String>();
    }

    private Observable<String> observable;

    public void addObserver(Observer<String> o) {
        observable.addObserver(o);
    }

    public void notifyObservers() {
        observable.notifyObservers(null);
    }

    public void onClick() {
        observable.setChanged();
        notifyObservers();
    }
}
