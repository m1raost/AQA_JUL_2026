package org.prog.session6;

public class PoliceStation {

    public void checkCar(Car car) {
        if (car.color.equals("black")) {
            System.out.println("Black car was reported stolen!");
        } else {
            System.out.println("Car " + car.color + " is not stolen");
        }
    }
}
