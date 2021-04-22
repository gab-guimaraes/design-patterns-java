package com.company.designPatterns.abstractFactory.factory;

import com.company.designPatterns.abstractFactory.buttom.Buttom;
import com.company.designPatterns.abstractFactory.buttom.MacOSButtom;
import com.company.designPatterns.abstractFactory.checkbox.Checkbox;
import com.company.designPatterns.abstractFactory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Buttom createButtom() {
        return new MacOSButtom();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}
