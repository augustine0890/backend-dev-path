package com.augustine.oop;

public class Person {
    // Properties
    int age;
    int height;
    String name;

    // Methods
    public void walk(int speed) {
        if (speed > 10) {
            System.out.println("Walking...");
        }
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    private void takeShower() {
        System.out.println("Taking a shower...");
    }
}
