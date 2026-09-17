package org.prog.session11.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    // 0
    // ...
    // 100 - красный     -> [начало_списка] - [красный] - [оранжевый]
    // 101 - оранжевый   -> [красный] - [оранжевый] - [желтый]
    // 102 - желтый      -> [оранжевый] - [желтый] - [зеленый]
    // 103 - зеленый     -> [желтый] - [зеленый] - [металлический]
    // 104 - металлический - [зеленый] - [металлический] - [голубой]
    // 105 - голубой     -> [металлический] - [голубой] - [синий]
    // 106 - синий       -> [голубой] - [синий] - [фиолетовый]
    // 107 - фиолетовый  -> [синий] - [фиолетовый] - [конец_списка]
    // ...
    // 1000
    // 1001

    public static void main(String[] args) {
        //индексированный список
        List<String> arrayList = new ArrayList<>();
        //двухсвязный список
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Rivne1");
        linkedList.add("Lutsk2");
        linkedList.add("Lutsk3");
        linkedList.add("Rivne4");
        linkedList.add("Lutsk5");

        arrayList.add("Rivne1");//0
        arrayList.add("Rivne2");//1
        arrayList.add("Rivne3");//2
        arrayList.add("Rivne4");//3
        arrayList.add("Rivne5");//4
        arrayList.add("Rivne6");//5
        arrayList.add("Rivne7");//6
        arrayList.add("Rivne8");//7
        //[...................] //8 <-----
//        arrayList.set(6, "Odessa");
//        arrayList.remove("Rivne1");
//        arrayList.remove(4);
//        arrayList.addAll(linkedList);
//        arrayList.removeAll(linkedList);
//        arrayList.contains("Rivne1");
//        System.out.println(arrayList.containsAll(linkedList));
        arrayList.clear();

        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
