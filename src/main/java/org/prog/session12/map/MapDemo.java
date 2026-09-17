package org.prog.session12.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put(null, "value4");
        map.put("key4", null);

//        Map<SocialLogin, String> ourCustomers = new HashMap<>();
//        ourCustomers.put(new SocialLogin("gmail", "123"), "petya_555");
//        ourCustomers.put(new SocialLogin("FB", "5671254357123"), "petya_555");
//        ourCustomers.put(new SocialLogin("insta", "5671254357123"), "petya_555");
//        ourCustomers.put(new SocialLogin("x.com", "abcdefg@x.com"), "petya_555");


//        map.containsKey("key1");
//        map.containsValue("value1");

//        Set<String> keys = map.keySet();
//        Collection<String> values = map.values();
//        Set<Map.Entry<String, String>> entrySet = map.entrySet();
//
//        System.out.println(keys.size());
//        System.out.println(values.size());
//        System.out.println(entrySet.size());

//        printLength(map.getOrDefault("key1", ""));
//        printLength(map.getOrDefault("key2", ""));
//        printLength(map.getOrDefault("key3", ""));

//        map.replace("key4", "value4");
//        map.replace("key1", "new_value_1");
//        map.replace("key2", "value2", "new_value_2");
//        map.replace("key3", "wrong_value", "new_value_3");

//        map.remove("key1", "value1");
//        System.out.println(map.get("key1"));

//        map2.put("key1", "value1");
//        map2.put("key2", "value4");
//        map2.put("key3", "value3");
//
//        map.putAll(map2);
//        map.putIfAbsent("key4", "value4");


//        System.out.println(map.get("key1"));
//        System.out.println(map.get("key2"));
//        System.out.println(map.get("key3"));
//        System.out.println(map.get("key4"));

//        map.put("key1", "value1");
//        map.put("key2", null);
//        map.put(null, "value2");

//        System.out.println(map.get("key1"));
//        System.out.println(map.get("key2"));
//
//        System.out.println(map.get(null));
//        map.remove(null);

//        Map<String, Customer> testUsers = new HashMap<>();
//        testUsers.put("maleNoPhoneNoMail", new Customer());
//        testUsers.put("femaleNoPhoneNoMail", new Customer());
//        testUsers.put("malePhoneNoMail", new Customer());
//        testUsers.put("femalePhoneNoMail", new Customer());
//        testUsers.put("femaleNoPhoneMail", new Customer());
//
//
//        testUsers.get("maleNoPhoneNoMail").firstName = "Oleg";
//        System.out.println(testUsers.get("maleNoPhoneNoMail").firstName);
    }

    public static void printLength(String s) {
        System.out.println("String length: " + s.length());
    }
}
