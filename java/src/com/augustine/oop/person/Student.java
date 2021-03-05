package com.augustine.oop.person;

public class Student extends Person {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Augustine Nguyen");
        student.walk(23);
        student.sleep();
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
