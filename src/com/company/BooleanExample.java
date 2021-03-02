package com.company;

public class BooleanExample {
    public static void main(String [] args){

        // default value = true
        boolean bool = true;
        System.out.println("bool : " + bool);

        bool = 1 > 2;
        System.out.println("bool : " + bool);

        bool = 0 < 1;
        System.out.println("bool : " + bool);

        bool = 0 > 1;
        System.out.println("bool : " + bool);
    }
}
