package org.prog.session8.override;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Crossover crossover = new Crossover();
        Truck truck = new Truck();
        Lorry lorry = new Lorry();
        RoadTrain roadTrain = new RoadTrain();

        car.turn();
        car.turn();
        truck.turn();
        lorry.turn();
        roadTrain.turn();
    }
}
