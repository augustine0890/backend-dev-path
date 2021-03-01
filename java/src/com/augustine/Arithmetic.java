package com.augustine;


import javax.sound.midi.Soundbank;

public class Arithmetic {
    public static void main(String[] args) {
        // Arithmetic Operations
        int ten = 10;
        int five = 5;
        int add = ten + five;
        System.out.println(add);
        System.out.println(10 - 3);
        System.out.println(10 % 3);
        System.out.println(12 / 3);

        // Math
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(23, 53));
        System.out.println((int) Math.pow(2, 0));
        System.out.println((int) Math.sqrt(36));
        System.out.println(Math.PI);

        // Comparison Operators
        int myAge = 21;
        int yourAge = 23;
        String name = "augustine";
        System.out.println(myAge > yourAge);
        System.out.println(myAge == yourAge);
        System.out.println(myAge <= yourAge);
        System.out.println(myAge != yourAge);
        System.out.println(myAge >= yourAge && name.contains("a"));

        // Logical Operators
        boolean isAdult = true;
        boolean isStudent = false;
        boolean isWorking = true;

        System.out.println(isAdult && isStudent);
        System.out.println((isAdult || isStudent) && isWorking);
        System.out.println(!isStudent || name.contains("u"));


    }
}
