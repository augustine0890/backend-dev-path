package com.augustine;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Arrays
        int [] numbers = new int[3];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;

        System.out.println(Arrays.toString(numbers));

        boolean [] booleans = new boolean[5];
        System.out.println(Arrays.toString(booleans));

        int [] numbers2 = {3, 4, 6, 7, 28, 102, 34, 234};
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
        System.out.println("The last number: " + numbers2[numbers2.length - 1]);

        String [] names = {"Augustine", "Phillip", "David"};
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        // Loops
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        // API
        Arrays.stream(numbers2).forEach(System.out::println);

        System.out.println("Reverse Order:");
        // Reverse order
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.println(numbers2[i]);
        }

        // Enhanced For Loop
        System.out.println("Enhanced For Loop:");
        for (int number: numbers2) {
            System.out.println(number);
        }

        for (String name: names) {
            System.out.println(name);
        }

        // Break and Continue
        String [] nameArray = {"Augustine", "Bob", "Anna", "Mike"};
        for (String name: nameArray) {
//            if (name.equals("Bob")) {
//                break;
//            }
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }

        // While loop
        int count = 0;

        do {
            System.out.println(count);
            count++;
        }
        while (count <= 20);
//        while (count <= 10) {
//            System.out.println("count: " + count);
//            count++;
//        }

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = scanner.nextLine();
        System.out.println("Nice to meet you, " + userName);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if (age < 18) {
            System.out.println("and you are not an adult.");
        } else {
            System.out.println("and you are an adult.");
        }
    }
}
