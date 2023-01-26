package com.company.resources.earlyobjects.chapter4.diceSimulator;

import java.util.Random;

public class Die {
    private int diceSides;

    Die(int diceSides){
        this.diceSides = diceSides;
    }
    private int roll(){
        Random randomSide = new Random();
        return randomSide.nextInt(diceSides) + 1;
    }
    public int getValue(){
        return roll();
    }
}
