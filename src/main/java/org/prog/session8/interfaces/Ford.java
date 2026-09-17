package org.prog.session8.interfaces;

public class Ford implements ICar, ITransport {

    @Override
    public void turnLeft() {
        System.out.println("Ford Turns Left");
    }

    @Override
    public void turnRight() {
        System.out.println("Ford Turns Right");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford Accelerates");
    }

    @Override
    public void decelerate() {
        System.out.println("Ford Decelerates");
    }

    @Override
    public void boardPassengers() {
        System.out.println("Ford Board Passengers");
    }
}
