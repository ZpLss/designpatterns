package com.designpatterns.strategypattern;

/**
 * 定义具体抽象策略角色
 */
public class SubStrategy implements Strategy{
    @Override
    public int count(int a, int b) {
        return a - b;
    }
}
