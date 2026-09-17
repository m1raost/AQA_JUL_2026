package org.prog.session12.home;

import java.util.*;

//TODO: набор телефонов (Androind/Apple), и за каждым теоефоном закрепить набор уникальных контактов (телефонных номеров - просто строки)
//TODO: набор владельцев уникальных телефонов (Androind/Apple), любым телефонов может владеть только один человек

//TODO: list of phones (Androind/Apple), where each phone has list of unique contact numbers (just strings)
//TODO: list of phone (Androind/Apple) owners where each owner may have several phones, but each phone may have only one owner

public class Main {

    public static void main(String[] args) {
        List<Set<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        map.put("list_1", new ArrayList<>());
        map.get("list_1").add("Oleg");
        map.get("list_1").add("Sam");
        map.put("list_2", new ArrayList<>());
        map.get("list_2").add("Jane");
        map.get("list_2").add("Ira");
        System.out.println(map);
    }
}
