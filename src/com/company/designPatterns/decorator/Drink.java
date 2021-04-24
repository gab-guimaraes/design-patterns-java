package com.company.designPatterns.decorator;

abstract public class Drink {
    protected String description;

    protected Drink() {
        description = "";
    }

    public String getDescription() {
        return description;
    }

    abstract public double getPrice();
}
