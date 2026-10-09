package org.prog.HomeWork8;

public class Android implements IPhone {

    public String color;
    public String model;

    public void unlock() {
        System.out.println("This phone unlocks with fingerprint.");
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Android) {
            Android and = (Android) obj;
            boolean isEqual = this.color.equals(and.color)
                    && this.model.equals(and.model);
            return isEqual;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return (this.color + this.model).hashCode();
    }
}
