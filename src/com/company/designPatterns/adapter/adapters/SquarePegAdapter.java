package com.company.designPatterns.adapter.adapters;

import com.company.designPatterns.adapter.round.RoundPeg;
import com.company.designPatterns.adapter.square.SquarePeg;

//adaptador de pinos quadrados para pinos redondos
//classe herda de pino redondo
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));;
        return result;
    }
}
