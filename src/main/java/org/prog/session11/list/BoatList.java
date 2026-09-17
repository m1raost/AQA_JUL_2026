package org.prog.session11.list;

import java.util.ArrayList;
import java.util.List;

public class BoatList {

    public static void main(String[] args) {
        List<Boat> list = new ArrayList<>();
        list.add(new Boat("green"));
        list.add(new Boat("red"));
        list.add(new Boat("blue"));
        list.add(new Boat("white"));
        list.add(new Boat("black"));

        System.out.println(list.indexOf(new Boat("white")));
    }
}
