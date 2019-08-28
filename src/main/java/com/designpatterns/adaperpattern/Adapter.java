package com.designpatterns.adaperpattern;

/**
 * Author:zhangp
 * Date:2019/6/6 16:19
 * Description:
 */
public class Adapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        System.out.println("这是Ps2接口。。。");
    }
}
