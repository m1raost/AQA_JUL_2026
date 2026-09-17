package org.prog.session8.overload;

public class Main {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.goTo("Lviv");
        bike.goTo("Odessa", "Kyiv");
        bike.goTo("Rivne", "Kharkiv", "Dnipro");
    }
}
