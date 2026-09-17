package org.prog.session11.constructor;

public class Car {

    private String color;
    private String brand;

    public Car() {
        this.brand = "Mazda";
        this.color = "White";
        Police.registerCar(color, brand);
    }

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        Police.registerCar(color, brand);
    }

    public void goTo(String destination) {
        System.out.println(color + " car " + brand + " goes to " + destination);
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        } else  {
            this.color = "White";
        }
    }
}
