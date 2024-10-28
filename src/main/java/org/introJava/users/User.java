package org.introJava.users;

public class User {
    private String name;
    private String surname;

    User(String name, String surname){
        this.name = name;
        this.surname = surname;
    };

    public void printFullName (){
        System.out.println(name + " " + surname);
    };
}
