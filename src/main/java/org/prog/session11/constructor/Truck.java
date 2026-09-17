package org.prog.session11.constructor;

public class Truck extends Car {

    public Truck() {
        super("White", "Volvo");
    }

    public Truck(String color, String brand) {
        super(color, brand);
    }
}
