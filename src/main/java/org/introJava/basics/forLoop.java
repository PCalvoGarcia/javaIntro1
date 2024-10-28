package org.introJava.basics;

public class forLoop {
    public static void main(String[] args) {
        for (byte i = 5; i <= 10; i++){
            if ((i%2) == 0){
                System.out.println("Loop number " + i + " is pair");
            } else {
                System.out.println("Loop number " + i + " isn't pair");
            }
        }
    }
}
