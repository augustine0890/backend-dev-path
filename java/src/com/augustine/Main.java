package com.augustine;

import javax.imageio.ImageReader;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Your code here
        /*
        Multiple lines comment
        */
	    System.out.println("java app");

	    // Primitive Data Types
        byte theByte = -123;
        short theShort = 23_432;
	    int number = 22_332; // 4 bytes
	    long theLong = 34_525_232L; // 8 bytes
        System.out.println(theLong);

        float theFloat = 32.324F;
        System.out.println(theFloat);
	    double num = 143.3478687;

	    boolean isAllow = true;

	    char nameInit = 'A';
	    System.out.println(nameInit);

	    // Reference Data Types
        String name = new String("Augustine");
        System.out.println(name.toUpperCase());
	    LocalDate now = LocalDate.now();
	    System.out.println(now.getYear());

	    int a = 10;
	    int b = a;
	    a = 100;
        System.out.println(a);

        Person andy = new Person("Andy");
        Person stephen = andy;
        System.out.println("Before changing andy:");
        System.out.println(andy.name + " " + stephen.name);

        // andy.name = "Andy Lau";
        stephen.name = "Stephen";
        System.out.println("After changing stephen:");
        System.out.println(andy.name + " " + stephen.name);
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}
