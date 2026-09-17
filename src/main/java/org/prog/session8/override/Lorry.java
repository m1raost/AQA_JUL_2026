package org.prog.session8.override;

public class Lorry extends Truck {

    @Override
    public void turn() {
        System.out.println("This is a long car. It turn like all long cars do.");
    }

    public void transportBigCargo() {
        System.out.println("Big cargo!");
    }
}
