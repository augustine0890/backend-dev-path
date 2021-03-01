package com.augustine;

public class ControlFlow {
    public static void main(String[] args) {
        // If Statements
        int age = 11;
        if (age >= 17) {
            System.out.println("You're an adult.");
        } else if (age >=16 && age < 17) {
            System.out.println("You are almost an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        // Ternary Operator
        int temp = 37;
        String message = temp >= 30 ? "It's really hot today" : "It's cool today";
        System.out.println(message);

        // Switch Statements
        String gender = "male";
        switch (gender) {
            case "female":
                System.out.println("Go left");
                break;
            case "male":
                System.out.println("Go right");
                break;
            case "prefer_not_say":
                System.out.println("Go straight");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
