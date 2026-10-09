package org.prog.session13;


public class Apple implements Phone {

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


    public Apple(String color, String model) {
        this.color = color;
        this.model = model;
    }


}
