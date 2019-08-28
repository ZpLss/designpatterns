package com.designpatterns.decoratorpattern;

/**
 * 具体的装饰者
 */
public class Milk extends Decorator{

    private String description = "加牛奶";
    private Drinks drinks;
    public Milk (Drinks drinks){
        this.drinks = drinks;
    }

    @Override
    public String getDescription() {
        return drinks.getDescription() + description;
    }

    @Override
    public double getPrice() {
        return drinks.getPrice() + 15;
    }
}
