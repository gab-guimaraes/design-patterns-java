package com.company.designPatterns.abstractFactory.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("you have created windows checkbox");
    }
}
