package org.prog.session13;

public class Android implements Phone {
    private String color;
    private String model;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getModel() {
        return model;
    }

    public Android(String color, String model) {
        this.color = color;
        this.model = model;
    }
}
