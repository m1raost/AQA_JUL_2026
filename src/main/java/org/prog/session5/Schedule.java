package org.prog.session5;

import java.time.LocalDateTime;

public class Schedule {

    public LocalDateTime[] departures;
    public Car[] cars;

    public void depart(int i) {
        System.out.println("Car " + cars[i].color + " departs at: " + departures[i]);
    }
}
