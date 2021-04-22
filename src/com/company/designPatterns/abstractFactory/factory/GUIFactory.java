package com.company.designPatterns.abstractFactory.factory;

import com.company.designPatterns.abstractFactory.buttom.Buttom;
import com.company.designPatterns.abstractFactory.checkbox.Checkbox;

/*
    fabrica abstrata
 */
public interface GUIFactory {
    Buttom createButtom();
    Checkbox createCheckBox();
}
