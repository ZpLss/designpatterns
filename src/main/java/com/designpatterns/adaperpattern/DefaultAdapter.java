package com.designpatterns.adaperpattern;

/**
 * 默认适配模式
 *      当不需要全部实现接口提供的方法时，默认适配器的目的是在于简化使用者对目标接口(抽象类)的实现，
 *      使用者只需要重载需要使用到的方法即可。
 */
public class DefaultAdapter extends AbstraceDefaultAdapter{
    @Override
    public void playBall() {
        System.out.println("我会打球");
    }
}
