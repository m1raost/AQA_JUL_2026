package org.prog.session8.staticstuff;

public class ClassA {

    public static String staticString;
    public String regularString;

    public void printStrings() {
        System.out.println(staticString);
        System.out.println(regularString);
    }

    public static void staticPrintStrings() {
        System.out.println(staticString);
    }
}
