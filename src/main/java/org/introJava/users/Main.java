package org.introJava.users;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Paula", "Calvo");
        User user2 = new User("Victor", "Clavo");

        user1.printFullName();
        user2.printFullName();
    }
}
