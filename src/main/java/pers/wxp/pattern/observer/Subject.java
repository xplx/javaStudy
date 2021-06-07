package pers.wxp.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:40
 * @description Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}

