package com.designpatterns.strategypattern;

public class Test {
    public static void main(String[] args) {
        Environment environment = new Environment(new AddStrategy());
        System.out.println(environment.count(1, 3));

        Environment environment1 = new Environment(new SubStrategy());
        System.out.println(environment1.count(5, 2));
    }
}
