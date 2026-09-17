package org.prog.session12.set;

import java.util.*;

public class SetDemo {

    public static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value1");
        list.add("value1");
        list.add("value1");
        list.add("value1");
        list.add("value1");
        list.add("value1");
        list.add("value1");
        list.add("value1");

        Set<String> set = new HashSet<>();
        set.add("key1");
        set.add("key2");
        set.add("key3");
        set.addAll(list);
        System.out.println(set.contains("key4"));
        System.out.println(set.size());

        for (String s : set) {
            System.out.println(s);
        }

//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            iterator.remove();
//            System.out.println(iterator.next());
//        }

//        String s1 = new String("red");
//        String s2 = new String("red");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

//        setExplained("key1");
//        setExplained("key1");
//        setExplained("key2");
//        setExplained("key2");
//        setExplained("key3");
//        setExplained("key3");
//        System.out.println(map.size());
    }

    public static void setExplained(String value) {
        map.put(value, value);
    }
}
