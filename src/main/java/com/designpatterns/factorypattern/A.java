package com.designpatterns.factorypattern;

/**
 * Author:zhangp
 * Date:2019/5/29 10:30
 * Description:
 */
public class A extends AbstractBean{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    @Override
    void description() {
        System.out.println("A");
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
