package com.designpatterns.adaperpattern;

/**
 * Author:zhangp
 * Date:2019/6/6 16:20
 * Description:
 */
public class AdaperTest {
    public static void main(String[] args) {
        Adapter a = new Adapter();
        a.isUsb();
        a.isPs2();
    }
}
