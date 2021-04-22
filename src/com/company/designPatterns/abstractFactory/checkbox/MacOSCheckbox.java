package com.company.designPatterns.abstractFactory.checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created macos checkbox");
    }
}
