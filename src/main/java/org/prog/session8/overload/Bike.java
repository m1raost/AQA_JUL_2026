package org.prog.session8.overload;

public class Bike {

    public void goTo(String destination) {
        goTo(destination, "current location");
    }

    public void goTo(String destination, String from) {
        goTo(destination, from, "nowhere");
    }

    public void goTo(String destination, String from, String stoppingAt) {
        System.out.println("Bike is going to " + destination + " from " + from + " stopping at " + stoppingAt);
    }

}
