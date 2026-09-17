package org.prog.session7;

//TODO:

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.engine = "2.0L";
        car.startDriving();
        car.endDriving();

        Crossover crossover = new Crossover();
        crossover.engine = "4.0L";
        crossover.startDriving();
        crossover.endDriving();
        crossover.attachCart();

        Truck truck = new Truck();
        truck.engine = "6.0L";
        truck.startDriving();
        truck.endDriving();
        truck.attachCart();
        truck.deliverCargo();
    }
}
