package org.prog.session11.list;

public class Car {

    public String color;
    public String brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void goTo() {
        System.out.println(color + " car of " + brand + " drives somewhere");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c = (Car) obj;
            boolean isEqual = this.color.equals(c.color)
                    && this.brand.equals(c.brand);
            return isEqual;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.color + this.brand).hashCode();
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", brand=" + brand + "]";
    }
}
