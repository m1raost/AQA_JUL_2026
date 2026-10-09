package org.prog.session2;

public class HomeWork_2 {
    public static void main(String[] args) {
        int myMoney = 2000;
        int phonePrice = 999;
        char currency = '$';



        if (myMoney > phonePrice * 3) {
            System.out.println("I can buy the phone!\n" + "I have " + myMoney + currency + "!");
        } else if (myMoney > phonePrice * 2) {
            System.out.println("I can credit the phone!\n" + "I have " + myMoney + currency + "!");
        } else {
            System.out.println("I can not buy the phone.\n" + "I have " + myMoney + currency + "!");
        }
    }
}
