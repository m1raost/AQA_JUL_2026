package org.prog.session8.overload;

public class UserService {

    public void createUser(String email) {
        createUser(email, "UK", 100, false);
    }

    public void createUser(String email, String country, int money, boolean isBanned) {
        System.out.println("Inserting into database:");
        System.out.println("Email: " + email);
        System.out.println("Country: " + country);
        System.out.println("Money: " + money);
        System.out.println("Banned: " + isBanned);
    }
}
