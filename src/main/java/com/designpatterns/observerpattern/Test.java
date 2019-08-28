package com.designpatterns.observerpattern;

public class Test {
    public static void main(String[] args) {
        //注册用户
        UserSubject userSubject = new UserSubject();
        Observer observer = new UserObserver("熊大");
        Observer observer1 = new UserObserver("熊二");
        userSubject.addUser(observer);
        userSubject.addUser(observer1);
        //推送消息
        userSubject.notifyUser("美国又被恐怖袭击了！");
    }
}
