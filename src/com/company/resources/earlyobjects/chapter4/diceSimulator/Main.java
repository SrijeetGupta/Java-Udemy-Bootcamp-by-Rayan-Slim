package com.company.resources.earlyobjects.chapter4.diceSimulator;

public class Main {
    public static void main(String[] args) {
        Die diceTest = new Die(6);
        Die diceTestTwoFuckYou = new Die(20);

        System.out.println(diceTest.getValue());
        System.out.println(diceTestTwoFuckYou.getValue());
    }
}
