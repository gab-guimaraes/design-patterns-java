package com.company.designPatterns.adapter;

import com.company.designPatterns.adapter.adapters.SquarePegAdapter;
import com.company.designPatterns.adapter.round.RoundHole;
import com.company.designPatterns.adapter.round.RoundPeg;
import com.company.designPatterns.adapter.square.SquarePeg;

public class Application {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5); //buraco redondo tamanho 5
        RoundPeg rpeg = new RoundPeg(5); //plugue tamanho 5 redondo

        if (hole.fits(rpeg)) {
            System.out.println("roud peg r5 fits round hole r5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2); //plugue quadrado tamanho 2
        SquarePeg largeSqPeg = new SquarePeg(20); //plugue tamanho 290
        //hole.fits(smallSqPeq); won't compile

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

    }
}
