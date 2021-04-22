package com.company.designPatterns.bridge.forms;

import com.company.designPatterns.bridge.color.Color;

public class Square extends Form {
    public Square(Color color, double line) {
        super(color, "square", line);
    }
}
