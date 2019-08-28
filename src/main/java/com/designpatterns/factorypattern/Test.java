package com.designpatterns.factorypattern;

/**
 * Author:zhangp
 * Date:2019/5/29 10:57
 * Description:
 */
public class Test {

    public static void main(String[] args) {
        AbstractBean bean = FactoryBean.getBean(0);
        bean.description();
    }
}
