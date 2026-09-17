package org.prog.session8.interfaces;

public class Mazda implements ICar, ITransport {
    @Override
    public void turnLeft() {
        System.out.println("Mazda Turns Left");
    }

    @Override
    public void turnRight() {
        System.out.println("Mazda Turns Right");
    }

    @Override
    public void accelerate() {
        System.out.println("Mazda Accelerates");
    }

    @Override
    public void decelerate() {
        System.out.println("Mazda Decelerates");
    }

    @Override
    public void boardPassengers() {
        System.out.println("Mazda Board Passengers");
    }
}
