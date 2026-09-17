package org.prog.session8.interfaces;

public class Main {

    public static void main(String[] args) {
        Ford ford = new Ford();
        Mazda mazda = new Mazda();
        drive(ford);
        drive(mazda);
        drive2(ford);
        drive2(mazda);
    }

    public static void drive(ICar car) {
        car.accelerate();
        car.turnRight();
        car.accelerate();
        car.turnLeft();
        car.decelerate();
        car.decelerate();
    }

    public static void drive2(ITransport transport) {
        transport.boardPassengers();
        transport.accelerate();
        transport.decelerate();
    }
}
