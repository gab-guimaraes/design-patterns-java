package com.company.designPatterns.bridge.forms;

import com.company.designPatterns.bridge.color.Color;

public class Circle extends Form {
    public Circle(Color color, double line) {
        super(color, "circle", line);
    }
}
