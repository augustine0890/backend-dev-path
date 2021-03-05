package com.augustine.oop;

public class Person {
    // Properties
    int age;
    int height;
    String name;

    // Constructor
    public Person(int myAge) {
        this.age = myAge;
    }
    public Person() {
        this(28);
    }
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
