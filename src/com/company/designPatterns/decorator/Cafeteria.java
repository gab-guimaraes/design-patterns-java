package com.company.designPatterns.decorator;

import javax.swing.border.BevelBorder;

public class Cafeteria {
    public static void main(String[] args) {
        Drink express = new Express();
        System.out.println(express.getDescription() + " R$: " + express.getPrice());

        Drink moca = new Moca(express);
        System.out.println(moca.getDescription() + " R$: " + moca.getPrice());
    }
}
