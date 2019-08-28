package com.designpatterns.decoratorpattern;

public class Test {
    public static void main(String[] args) {
        Milk milk = new Milk(new Coffee());
        Sugar sugar = new Sugar(new Coffee());
        System.out.println(milk.getDescription() + " 价格：" + milk.getPrice());
        System.out.println(sugar.getDescription() + " 价格：" + sugar.getPrice());
    }
}
