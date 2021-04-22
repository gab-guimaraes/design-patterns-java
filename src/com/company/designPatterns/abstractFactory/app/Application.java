package com.company.designPatterns.abstractFactory.app;

import com.company.designPatterns.abstractFactory.buttom.Buttom;
import com.company.designPatterns.abstractFactory.checkbox.Checkbox;
import com.company.designPatterns.abstractFactory.factory.GUIFactory;

public class Application {
    //classe application trabalha apenas com tipos abstratos (interfaces)
    private Buttom buttom;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        buttom = factory.createButtom();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        buttom.paint();
        checkbox.paint();
    }

}
