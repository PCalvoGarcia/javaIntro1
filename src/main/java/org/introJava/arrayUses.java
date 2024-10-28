package org.introJava;

public class arrayUses {
    public static void main(String[] args) {
/*
        int[] numbers = new int[4];
        String[] names = {"Paula","Maria", "Carla"};
*/
        String[] names = {"Madrid","Castellon", "Valencia", "Alicante"};
        int[] numbers = {1,2,3,4};

        for ( String name : names){
            System.out.println(name);
        }
        for ( int number : numbers){
            System.out.println(number);
        }
    }
}
