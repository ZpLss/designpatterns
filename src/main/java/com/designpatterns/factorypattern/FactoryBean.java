package com.designpatterns.factorypattern;

/**
 * Author:zhangp
 * Date:2019/5/29 10:33
 * Description:
 */
public class FactoryBean {


    public static AbstractBean getBean (int type){

        if (0 == type) {

            return new A();
        }
        return new B();
    }
}
