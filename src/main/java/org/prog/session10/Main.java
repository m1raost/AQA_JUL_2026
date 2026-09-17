package org.prog.session10;

import java.io.FileNotFoundException;
import java.io.FileReader;

//TODO: 1. Write your own exception that extends RuntimeException
//      2. In equals AND hashCode if phone has null color or null model -> throw your exception
//      3. In public static void main - catch your exception

public class Main {

    public static void main(String[] args) {
        try {
            checkedException1();
            printLength1(null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void checkedException1() {
        checkedException2();
    }

    public static void checkedException2() {
        checkedException3();
    }

    public static void checkedException3() {
        checkedException4();
    }

    public static void checkedException4() {
        try {
            FileReader fileReader = new FileReader("a");
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void throwException(String msg) {
        if (msg != null) {
            throw new RuntimeException(msg);
        } else {
            throw new NullPointerException();
        }
    }

    public static void printLength1(String s) {
        printLength2(s);
    }

    public static void printLength2(String s) {
        printLength3(s);
    }

    public static void printLength3(String s) {
        printLength4(s);
    }

    public static void printLength4(String s) {
        printLength5(s);
    }

    public static void printLength5(String s) {
        printLength6(s);
    }

    public static void printLength6(String s) {
        System.out.println(s.length());
//        try {
//            FileReader fr = new FileReader(s);
//        } catch (ClassCastException cce) {
//            System.out.println("this won't trigger");
//        } catch (ArrayIndexOutOfBoundsException aoe) {
//            System.out.println("Array index exception");
//        } catch (IndexOutOfBoundsException ioe) {
//            System.out.println("Index out of bounds - any");
//        } catch (RuntimeException re) {
//            System.out.println("Some RTE");
//        } catch (Exception e) {
//            System.out.println("General exception");
//        }
    }
}
