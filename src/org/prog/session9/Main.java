package org.prog.session9;

//TODO: For class Android and Apple, add color, model;
//TODO: add equals and hascode for both
//TODO: compare green android vs white apple
//TODO: compare green android vs another green android
//TODO: compare white apple vs another white apple
//TODO: compare golden apple vs another white apple
//TODO: compare black android vs green android

public class Main {

    /**
     * ######[car1@Car]###################
     * ######[car2@Car]###################
     * #####[o1@Object]###################
     * #####[o2@Object]###################
     * -----------------------------------
     * ############10#####################
     *
     * @param args
     */

    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "yellow";
        myCar.brand = "Dodge";

        yourCar.color = "yellow";
        yourCar.brand = "Dodge";

        System.out.println(myCar);
        System.out.println(yourCar);

        System.out.println(myCar.equals(yourCar));
        System.out.println(myCar.hashCode());
        System.out.println(yourCar.hashCode());
        System.out.println(myCar == yourCar);
    }
}
