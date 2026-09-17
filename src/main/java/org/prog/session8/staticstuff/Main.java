package org.prog.session8.staticstuff;

public class Main {

    /**
     * ##[ClassA.staticString]####
     * ===========================
     * ###########################
     * ###########################
     * ###########################
     * ######[a@ClassA]###########
     * ###########################
     * ###########################
     * ###########################
     *
     * @param args
     */

    public static void main(String[] args) {
        ClassA.staticString = "Hello World";
        ClassA.staticPrintStrings();

        ClassA a1 = new ClassA();
        ClassA a2 = new ClassA();
        a1.regularString = "Hello class A1";
        a2.regularString = "Hello class A2";
        System.out.println("==============================");
        a1.printStrings();
        a2.printStrings();
        System.out.println("==============================");
        ClassA.staticString = "Hello static string!";

        a1.printStrings();
        a2.printStrings();
    }
}
