package com.designpatterns.observerpattern;

/**
 * 具体的观察者
 */
public class UserObserver implements Observer {
    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String s) {
        System.out.println(name + "收到消息：" + s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
