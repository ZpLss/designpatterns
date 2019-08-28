package com.designpatterns.singletonpattern;

/**
 * 饿汉式单例模式
 * 三要素：
 * 1、私有的构造方法；
 * 2、指向自己实例的私有静态引用；
 * 3、以自己实例为返回值的静态的公有方法。
 * <p>
 * 类加载的方式是按需加载，且只加载一次
 * 当类被加载，会实例化一个对象交给自己的引用，供系统使用，由于这个类在整个生命周期中只会被加载一次，
 * 因此只会创建一个实例。
 * 线程安全
 */
public class HungrySingleton {

    //指向自己实例的静态引用
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //私有的构造方法
    private HungrySingleton() {
    }

    //以自己实例为返回值的静态共有方法，静态工厂方法
    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
