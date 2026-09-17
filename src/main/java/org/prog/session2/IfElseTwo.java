package org.prog.session2;

public class IfElseTwo {

    public static void main(String[] args) {
        int myMoney = 9000;
        boolean iWantIphone = true;

        if (myMoney < 10000 && !iWantIphone) {
            System.out.println("I dont have money and I dont want iPhone");
        } else if (myMoney < 10000 && iWantIphone) {
            System.out.println("I dont have money and I want iPhone!");
        } else if (myMoney >= 10000 && !iWantIphone) {
            System.out.println("I DO have money, but i DONT want iPhone!");
        } else {
            System.out.println("I will go and buy iPhone!");
        }
    }
}
