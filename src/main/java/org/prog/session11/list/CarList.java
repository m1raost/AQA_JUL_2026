package org.prog.session11.list;

import java.util.ArrayList;
import java.util.List;

public class CarList {

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("red", "ford"));
        list.add(new Car("blue", "ford"));
        list.add(new Car("green", "ford"));
        list.add(new Car("white", "ford"));
        list.add(new Car("black", "toyota"));

        System.out.println(list.indexOf(new Car("green", "ford")));
    }
}
