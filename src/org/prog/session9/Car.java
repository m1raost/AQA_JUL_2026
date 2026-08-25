package org.prog.session9;

public class Car {

    public String color;
    public String brand;

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
