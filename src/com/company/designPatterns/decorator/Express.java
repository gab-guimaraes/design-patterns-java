package com.company.designPatterns.decorator;

public class Express extends Drink {

    public Express() {
        description = "Express Coffe";
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
