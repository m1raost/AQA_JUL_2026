package org.prog.session6;

public class CarService {

    public PoliceStation policeStation = new PoliceStation();

    public void paintCar(Car car, String color) {
        policeStation.checkCar(car);
        System.out.println("Will paint car from " + car.color + " to " + color);
        car.color = color;
    }

    public void incr(int i) {
        System.out.println("Increment called for " + i);
        i = i + 1000;
        System.out.println("Increment done for i: " + i);
    }
}
