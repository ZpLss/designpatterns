package com.designpatterns.adaperpattern;

/**
 * 默认适配模式，抽象类只需要实现需要的方法就好
 *      在java一般的用法中，如果要用普通类来实现接口，则必须实现该接口中的所有方法，这样就会导致需要实现多余的方法；
 *      采用抽象类来实现方法，可以实现该接口中的部分方法，而且当其他类继承该抽象类时，只需要实现抽象类中未实现的方法即可。
 *
 */
public abstract class AbstraceDefaultAdapter implements Work {

    public void dance() {
        System.out.println("我会跳舞");
    }

    public void sing() {
        System.out.println("我会唱歌");
    }

}
