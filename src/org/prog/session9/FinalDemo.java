package org.prog.session9;

public class FinalDemo {

    public static final String S = "this is a string";
    public final static Car FINAL_CAR = new Car();
    public final static int[] ints = new int[10];

    public static void main(String[] args) {
        FINAL_CAR.color = "red";
        FINAL_CAR.brand = "Ford";
        ints[0] = 1;
    }
}
