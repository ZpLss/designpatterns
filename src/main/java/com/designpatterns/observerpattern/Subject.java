package com.designpatterns.observerpattern;

/**
 * 抽象被观察者
 */
public interface Subject {

    //注册用户
    void addUser(Observer observer);

    //删除用户
    void deleteUser(Observer observer);

    //发送消息
    void notifyUser(String s);

}
