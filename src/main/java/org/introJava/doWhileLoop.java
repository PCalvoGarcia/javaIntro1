package org.introJava;

public class doWhileLoop {
    public static void main(String[] args) {
        for (byte i = 5; i<=10; i++){
            System.out.println("Loop number " + i + ".");
        }

        byte conuter = 5;
        while (conuter <= 10){
            if (conuter%2 != 0){
                System.out.println(("Loop number " + conuter + " is odd."));
            }
            conuter++;
        }
    }
}
