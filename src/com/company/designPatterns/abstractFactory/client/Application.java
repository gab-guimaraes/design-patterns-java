package com.company.designPatterns.abstractFactory.client;

import com.company.designPatterns.abstractFactory.buttom.Buttom;
import com.company.designPatterns.abstractFactory.checkbox.Checkbox;
import com.company.designPatterns.abstractFactory.factory.GUIFactory;

public class Application {
    private Buttom buttom;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        buttom = guiFactory.createButtom();
        checkbox = guiFactory.createCheckBox();
    }

    public void paint() {
        buttom.paint();
        checkbox.paint();
    }
}
