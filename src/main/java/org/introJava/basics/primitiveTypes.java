package org.introJava.basics;

public class primitiveTypes {
    public static void main(String[] args) {
        // Integer
        byte isByte = 126;
        System.out.println("byte: " + isByte);

        short isShort = 32000;
        System.out.println("short: " + isShort);

        int isInt = 2147483647;
        System.out.println("int: " + isInt);

        long isLong = 9223372036854775807L;
        System.out.println("long: " + isLong);

        // Decimals
        float isFloat = 3.14159f;
        System.out.println("float: " + isFloat);

        double isDouble = 3.141592653589793;
        System.out.println("double: " + isDouble);

        // Character
        char isChar = 'A';
        System.out.println("char: " + isChar);

        // Boolean
        boolean isBoolean = true;
        System.out.println("boolean: " + isBoolean);

        //  String
        String name = "Paula";
        String surname = "Calvo";
        String fullName = name + " " + surname;
        System.out.println(fullName);

    }
}
