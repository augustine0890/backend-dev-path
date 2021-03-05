package com.augustine.oop.animal;

public class Animal {
    int legs, ears, eyes;
    String name;
    String family;

    public Animal() {
        this(4, 2, 2);
    }

    public Animal(int legs, int ears, int eyes) {
        this.legs = legs;
        this.ears = ears;
        this.eyes = eyes;
    }

    // Getter
    public String getName() {
        return name;
    }
    public String getFamily() {
        return family;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public void setFamily(String newFamily) {
        this.family = newFamily;
    }
}
