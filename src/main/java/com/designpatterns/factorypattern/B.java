package com.designpatterns.factorypattern;

/**
 * Author:zhangp
 * Date:2019/5/29 10:32
 * Description:
 */
public class B extends AbstractBean{

    private String name;
    private Integer age;

    @Override
    void description() {
        System.out.println("B");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
