package com.designpatterns.observerpattern;

/**
 * 观察者模式：
 *   又被称为发布-订阅（Publish/Subscribe）模式，属于行为型模式的一种，定义对象间一种一对多的依赖关系，
 *   使得每当一个对象改变状态，则所有依赖它的对象都会得到通知并自动更新。
 *   此设计模式最重要的作用就是 解耦！将观察者与被观察者解耦，使得他们之间的依赖性更小。
 *
 *   主要角色有：
 *      subject：抽象被观察者
 *      concreteSubject：具体被观察者
 *      observer：抽象观察者
 *      concreteOberver：具体观察者
 */
public interface Observer {
    void update(String s);
}
