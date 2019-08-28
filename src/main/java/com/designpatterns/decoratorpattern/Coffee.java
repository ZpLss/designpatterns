package com.designpatterns.decoratorpattern;

/**
 * 被装饰者
 */
public class Coffee implements Drinks{

    private String description = "原味咖啡";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
