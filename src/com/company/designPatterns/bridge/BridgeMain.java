package com.company.designPatterns.bridge;

import com.company.designPatterns.bridge.color.Blue;
import com.company.designPatterns.bridge.forms.Form;
import com.company.designPatterns.bridge.forms.Square;

public class BridgeMain {
    public static void main(String[] args) {
        String input = "square";
        String input2 = "red";
        Form form1;

        if (input.contains("square")) {
            form1 = new Square(new Blue("blue"), 1.0);
            form1.paint();
        }
    }
}
