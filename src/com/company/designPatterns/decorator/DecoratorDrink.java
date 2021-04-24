package com.company.designPatterns.decorator;

abstract public class DecoratorDrink extends Drink {
    protected Drink drink;

    protected DecoratorDrink(Drink drink) {
        this.drink = drink;
    }
    abstract public String getDescription();
}
