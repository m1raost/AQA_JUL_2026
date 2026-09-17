package org.prog.session7;

public class Boat {

    public String engine;

    public void turn(String direction) {
        System.out.println("Boat turns " + direction);
    }

    public void startDriving() {
        System.out.println("Engine of a Boat " + engine + " vroom");
    }

    public void endDriving() {
        System.out.println("Engine of a Boat " + engine + " stops");
    }
}
