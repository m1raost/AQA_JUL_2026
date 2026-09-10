package HomeWork12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Map<IPhone, List<String>> phoneContacts = new HashMap<>();

        Android android1 = new Android("White", "Nokia");
        Apple apple1 = new Apple("Golden", "14 Pro");

        phoneContacts.put(android1, new ArrayList<>());
        phoneContacts.get(android1).add("123-456-789");
        phoneContacts.get(android1).add("333-222-111");

        phoneContacts.put(apple1, new ArrayList<>());
        phoneContacts.get(apple1).add("380-272-736");
        phoneContacts.get(apple1).add("163-826-385");

        System.out.println(phoneContacts);

        Map<String, List<IPhone>> ownerPhones = new HashMap<>();
        ownerPhones.put("Alice", new ArrayList<>());
        ownerPhones.get("Alice").add(android1);
        ownerPhones.get("Alice").add(apple1);

        ownerPhones.put("Bob", new ArrayList<>());
        Android android2 = new Android("Red", "Oppo");
        ownerPhones.get("Bob").add(android2);

        System.out.println(ownerPhones);
    }
}
