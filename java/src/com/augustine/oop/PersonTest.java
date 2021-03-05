package com.augustine.oop;

public class PersonTest {
    public static void main(String[] args) {
        Person me = new Person();
        Person myNeighbour = new Person(55);
        Person lecturer = new Person(45);

        System.out.println(me.age);
        me.walk(20);
        me.walk(5);
        me.sleep();

        myNeighbour.walk(20);
        myNeighbour.walk(5);
        myNeighbour.sleep();

        lecturer.walk(20);
        lecturer.walk(5);
        lecturer.sleep();
    }
}
