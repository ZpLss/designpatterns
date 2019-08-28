package com.designpatterns.decoratorpattern;

/**
 * 具体的装饰者
 */
public class Sugar extends Decorator {
    private String description = "加白糖";
    private Drinks drinks;

    public Sugar(Drinks drinks) {
        this.drinks = drinks;
    }

    @Override
    public String getDescription() {
        return drinks.getDescription() + description;
    }

    @Override
    public double getPrice() {
        return drinks.getPrice() + 6;
    }
}
