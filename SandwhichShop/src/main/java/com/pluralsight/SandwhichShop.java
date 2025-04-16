package com.pluralsight;

import java.util.Scanner;

public class SandwhichShop {

    static Scanner myScanner = new Scanner(System.in); // intialized scanner

    public static void main(String[] args) {


        System.out.println("Welcome to the Sandwhich Shop!");
        System.out.println("\nWhat would you like to order? ");
        System.out.println("\nRegular(R) | Large(L) ");

        String choice = myScanner.nextLine();

        int age = 0;
        double Regular = 5.45;
        double Large = 8.95;

        if (choice.equalsIgnoreCase("R")) {
            System.out.println("How old are you?");

            age = myScanner.nextInt();

            if (age > 18 && age < 64) {
                System.out.printf("Your total is: $%.2f", Regular);
            } else if (age <= 17) {
                System.out.printf("Congrats on your discount! Your total is: $%.2f",(Regular * 0.9));
            } else if (age >= 65) {
                System.out.printf("Congrats on your discount! Your total is: $%.2f",(Regular * 0.8));
            }

        } else if (choice.equalsIgnoreCase("L")) {
            System.out.println("How old are you?\n");

            age = myScanner.nextInt();

            if (age > 18 && age < 64) {
                System.out.printf("Your total is: $%.2f", Large);
            } else if (age <= 17) {
                System.out.printf("Congrats on your discount! Your total is: $%.2f",(Large * 0.9));
            } else if (age >= 65) {
                System.out.printf("Congrats on your discount ! Your total is: $%.2f",(Large * 0.8));
            }

        }

        static
    }
}
