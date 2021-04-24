package com.company.designPatterns.decorator;

public class Moca extends DecoratorDrink {
    protected Moca(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " Moca";
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.25;
    }
}
