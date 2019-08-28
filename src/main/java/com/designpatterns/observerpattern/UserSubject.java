package com.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者
 */
public class UserSubject implements Subject {
    //定义容器，里面可以有多个观察者
    private List<Observer> list = new ArrayList<>();


    @Override
    public void addUser(Observer observer) {
        list.add(observer);
    }

    @Override
    public void deleteUser(Observer observer) {
        list.remove(observer);
    }

    @Override//通知观察者
    public void notifyUser(String s) {
        for (Observer observer : list){
            observer.update(s);
        }
    }
}
