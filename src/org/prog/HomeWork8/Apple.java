package org.prog.HomeWork8;


public class Apple implements IPhone {

    public String color;
    public String model;

    public void unlock() {
        System.out.println("This phone unlocks with FaceID.");
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Apple) {
            Apple a = (Apple) obj;
            boolean isEqual = this.color.equals(a.color)
                    && this.model.equals(a.model);
            return isEqual;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return (this.color + this.model).hashCode();
    }
}
