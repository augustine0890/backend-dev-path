package com.augustine.oop;

public class Animals {
    public static void main(String[] args) {
        Animal cow = new Animal();
        Animal goat = new Animal();
        Animal duck = new Animal(2, 2, 2);

        cow.setName("Cow");
        cow.setFamily("Bovidae");

        goat.setName("Goat");
        goat.setFamily("Bovidae");

        duck.setName("Duck");
        duck.setFamily("Anatidae");

        System.out.println(cow.getName());
        System.out.println(goat.getName());
        System.out.println(duck.getFamily());
    }
}
