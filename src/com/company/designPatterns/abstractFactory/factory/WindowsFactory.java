package com.company.designPatterns.abstractFactory.factory;

import com.company.designPatterns.abstractFactory.buttom.Buttom;
import com.company.designPatterns.abstractFactory.buttom.WindowsButtom;
import com.company.designPatterns.abstractFactory.checkbox.Checkbox;
import com.company.designPatterns.abstractFactory.checkbox.MacOSCheckbox;
import com.company.designPatterns.abstractFactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Buttom createButtom() {
        return new WindowsButtom();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
