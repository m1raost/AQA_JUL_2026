package org.prog.session5;

public class Car {

    public String color = "white";
    public int speed;

    public void goTo(String destination) {
//        if (color.equals("black")) {
//            System.out.println("Black cars are cool!");
//        } else {
//            System.out.println("Other car colors are not cool!");
//        }
        System.out.println(color + " car goes to " + destination + " at " + speed + " km / h");
    }
}
