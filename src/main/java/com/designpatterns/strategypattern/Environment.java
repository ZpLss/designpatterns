package com.designpatterns.strategypattern;

/**
 * 定义具体的策略切换环境
 */
public class Environment {
    /**
     * 策略的引用
     */
    private Strategy strategy;

    /**
     * 给策略赋值的构造方法
     */
    public Environment (Strategy strategy){
        this.strategy = strategy;
    }

    public int count(int num1, int num2){
        return strategy.count(num1,num2);
    }


}
