package org.introJava.users;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ralph", "Wiggum");
        User user2 = new User("Apu", "Nahasapeemapetilon");
        User user3 = new User("Montgomery", "Burns");

        User[] users = {user1,user2, user3};
        for (User user : users) {
            System.out.println(user.fullName());
        }
    }
}
