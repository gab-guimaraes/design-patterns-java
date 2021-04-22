package com.company.designPatterns.bridge.forms;

import com.company.designPatterns.bridge.color.Color;

public class Form {
      protected String name;
      protected double line;
      protected Color color;

      public Form(Color color, String name, double line) {
            this.color = color;
            this.line = line;
            this.name = name;
      }

      public void paint() {
            System.out.println("paiting " + this.name + " color " + color.getName());
      }
}
