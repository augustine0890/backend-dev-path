package com.augustine.oop.person;

public class Lecturer extends Person {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Prof. James Bond");
        lecturer.walk(20);
        lecturer.sleep();
        System.out.println(lecturer.getName());
        System.out.println(lecturer.getAge());
    }


}
