package org.prog.session5;
//TODO:
// Write class Plane
// Plane must have max seats
// plane must have method board passengers
// board passengers will accept int amount of passengers to board
// if passengers to board more than seats -> write "too many passengers"
// else -> write "boarded X passengers, Y more seats remain"

// X boarded and Y denied

public class Plane {
     private int maxSeats = 10;


    public void boardPassengers(int amount){
        if(maxSeats == 0){
            System.out.println("Plane is full!");
        }
        else if(amount > maxSeats){
            //   2        7         5
            int extra = amount - maxSeats;
            System.out.println(maxSeats + " boarded and " + extra + " denied");
            maxSeats = 0;
        }
        else{
            maxSeats = maxSeats - amount;
            System.out.println("Boarded " + amount + " passengers, " + maxSeats + " more seats remain");
        }
    }
}
