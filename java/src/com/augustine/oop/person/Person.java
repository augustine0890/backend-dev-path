package com.augustine.oop.person;

public class Person {
    // Properties
    int age;
    int height;
    int weight;
    String name;

    // Constructor
    public Person(int myAge, int myHeight, int myWeight) {
        this.age = myAge;
        this.height = myHeight;
        this.weight = myWeight;
    }
    public Person() {
        this(28, 10, 60);
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
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    private void takeShower() {
        System.out.println("Taking a shower...");
    }
}
