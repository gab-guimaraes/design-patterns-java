package com.company.designPatterns.decorator;

public class Caramelo extends DecoratorDrink {
    protected Caramelo(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return getDescription() + " Caramelo";
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.85;
    }
}
