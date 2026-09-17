package org.prog.session5;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//TODO:
// Write class Plane
// Plane must have max seats
// plane must have method board passengers
// board passengers will accept int amount of passengers to board
// if passengers to board more than seats -> write "too many passengers"
// else -> write "boarded X passengers, Y more seats remain"

public class Main {

    /**
     * ###################################
     * ###################################
     * ###################################
     * ########[car1@Car]#################
     * ###################################
     * ########[car2@Car]#################
     * ####################[car4@Car]#####
     * ########[car3@Car]#################
     * ############10#####################
     * ###################################
     *
     * @param args
     */

    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        schedule.cars = new Car[3];
        schedule.departures = new LocalDateTime[3];

        schedule.cars[0] = new Car();
        schedule.cars[1] = new Car();
        schedule.cars[2] = new Car();

        schedule.cars[0].color = "red";
        schedule.cars[1].color = "yellow";
        schedule.cars[2].color = "black";

        schedule.departures[0] = LocalDateTime.now();
        schedule.departures[1] = LocalDateTime.now().plus(1, ChronoUnit.HOURS);
        schedule.departures[2] = LocalDateTime.now().plus(2, ChronoUnit.HOURS);

        schedule.depart(0);
        schedule.depart(1);
        schedule.depart(2);

//        Car car1 = new Car();
//        Car car2 = new Car();
//        Car car3 = new Car();
//        Car car4 = new Car();
//
//        car1.color = "red";
//        car2.color = "green";
//        car3.color = "blue";
//        car4.color = "black";
//
//        car1.speed = 100;
//        car2.speed = 110;
//        car3.speed = 120;
//        car4.speed = 150;
//
//        car1.goTo("Kyiv");
//        car1.goTo("Rivne");
//        car1.goTo("Kharkiv");
//        car1.goTo("Kyiv");
//        car2.goTo("Lviv");
//        car3.goTo("Odessa");
//        car4.goTo("Dnipro");
    }
}
