package com.augustine;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        // String
        char a = 'A';
        char b = 'B';
        System.out.println(a);

        String name = new String("Augustine");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(name.length() - 1));

        String softWare = new String("software");
        System.out.println(name.contains(softWare));
        System.out.println(name.equals(softWare));
    }
}
