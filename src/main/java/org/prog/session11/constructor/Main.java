package org.prog.session11.constructor;

import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("red", "ford");
        Car car2 = new Car();

        car.goTo("Lviv");
        car2.goTo("Odessa");

        Truck truck = new Truck();
        Truck truck2 = new Truck("Black", "Volvo");
        truck.goTo("Dnipro");
        truck2.goTo("Dnipro");

        BigTruck bigTruck = new BigTruck();
        bigTruck.goTo("Rivne");
    }
}
