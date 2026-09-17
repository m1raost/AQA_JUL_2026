package org.prog.session6;

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
     * ###################################
     * ############10###15################
     * ###################################
     *
     * @param args
     */

    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        int k = 10;
        int l = 15;
        Car car1 = new Car();
        CarService carService = new CarService();

        car1.color = "white";

        System.out.flush();
        System.out.println("Car 1 before paint: " + car1.color);
        carService.paintCar(car1, "yellow");
        System.out.println("Car 1 after paint: " + car1.color);
        System.out.println("=============================");
        System.out.println("i before incr: " + i);
        carService.incr(i);
        System.out.println("i after incr: " + i);
    }
}