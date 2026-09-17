package org.prog.session2;

//TODO: write if-else-if-else with:
// - declare int myMoney
// - declare int phonePrice
// logic: if you have more money TWICE that phone costs -> credit it.
// If THRICE money of phone price -> buy it

public class IfElseOne {

    public static void main(String[] args) {
        int myMoney = 31000;

        if (myMoney < 10001) {
            System.out.println("I have 10001 exactly");
        }

        if (myMoney > 10000) {
            System.out.println("I can buy a new phone!");
        } else {
            System.out.println("I need to save some money!");
        }

        if (myMoney < 10000) {
            System.out.println("I need to save some money!");
        } else if (myMoney < 20000) {
            System.out.println("I can go and see what phones are for sale!");
        } else if (myMoney < 30000) {
            System.out.println("I can go and buy any cheap phone!");
        } else {
            System.out.println("I can go and buy any phone!");
        }
    }
}
