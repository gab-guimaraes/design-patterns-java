package com.company.designPatterns.abstractFactory.app;

import com.company.designPatterns.abstractFactory.factory.GUIFactory;
import com.company.designPatterns.abstractFactory.factory.MacOSFactory;
import com.company.designPatterns.abstractFactory.factory.WindowsFactory;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = "mac";
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
