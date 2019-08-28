package com.designpatterns.adaperpattern;

/**
 * Author:zhangp
 * Date:2019/6/6 16:17
 * Description:
 */
public class Usber implements USB {
    @Override
    public void isUsb() {
        System.out.println("这是USB接口。。。");
    }
}
