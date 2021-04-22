package com.company.designPatterns.abstractFactory.buttom;

public class WindowsButtom implements Buttom{

    @Override
    public void paint() {
        System.out.println("You have created windows buttom");
    }
}
