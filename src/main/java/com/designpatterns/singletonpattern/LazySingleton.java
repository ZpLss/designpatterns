package com.designpatterns.singletonpattern;

/**
 * 懒汉式单例
 * 三要素：
 * 1、私有的构造方法
 * 2、指向自己实例的私有静态引用
 * 3、以自己实例为返回值的静态公有方法
 * <p>
 * 只有在需要的时候，才会创建实例
 * 在多线程环境下式不安全的
 */
public class LazySingleton {

    //私有构造方法
    private LazySingleton() {
    }

    //指向自己实例的静态引用
    private static LazySingleton singleton;

    //以自己实例为返回值的静态公有方法，静态工厂方法
    //线程不安全
    public static LazySingleton getInstance() {
        //需要的时候，才去创建实例
        if (null == singleton) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    public String sentNotice(String msg){
        return msg;
    }
}
