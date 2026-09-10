package HomeWork12;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Map<IPhone, Set<String>> phoneContacts = new HashMap<>();

        Android android1 = new Android("White", "Nokia");
        Apple apple1 = new Apple("Golden", "14 Pro");

        phoneContacts.put(android1, new HashSet<>());
        phoneContacts.get(android1).add("123-456-789");
        phoneContacts.get(android1).add("333-222-111");

        phoneContacts.put(apple1, new HashSet<>());
        phoneContacts.get(apple1).add("380-272-736");
        phoneContacts.get(apple1).add("163-826-385");

        System.out.println(phoneContacts);

        Map<String, Set<IPhone>> ownerPhones = new HashMap<>();
        ownerPhones.put("Alice", new HashSet<>());
        ownerPhones.get("Alice").add(android1);
        ownerPhones.get("Alice").add(apple1);

        ownerPhones.put("Bob", new HashSet<>());
        Android android2 = new Android("Red", "Oppo");
        ownerPhones.get("Bob").add(android2);

        System.out.println(ownerPhones);
    }
}
