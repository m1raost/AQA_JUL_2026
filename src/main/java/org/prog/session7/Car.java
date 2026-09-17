package org.prog.session7;

public class Car {

    public String engine;

    public void turn(String direction) {
        System.out.println("Car turns " + direction);
    }

    public void startDriving() {
        System.out.println("Engine " + engine + " vroom");
    }

    public void endDriving() {
        System.out.println("Engine " + engine + " stops");
    }

    private void smth() {
        System.out.println("smth private");
    }
}
