package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // intialized scanner

        System.out.println("Welcome to the Basic Calculator! Here are your operators ");
        System.out.println("\nADD(A)\nSubtract(S)\nMULTIPLE(M)\nDIVIDE(D)");
        System.out.println("\nselect: ");


        String choice = myScanner.nextLine();
        if (choice.equalsIgnoreCase("M")) {

            System.out.println("Enter first number to multiply: ");
            int num1 = myScanner.nextInt();

            System.out.println("Enter second number to multiply: ");
            int num2 = myScanner.nextInt();

            int sum = num1 * num2;

            System.out.println("The answer is: " +  sum);
        }
        else if (choice.equalsIgnoreCase("D")) {

            System.out.println("Enter first number to divide: ");
            int num1 = myScanner.nextInt();

            System.out.println("Enter second number to divide: ");
            int num2 = myScanner.nextInt();

            int sum = num1 / num2;

            System.out.println("The answer is: " +  sum);
        }
        else if (choice.equalsIgnoreCase("A")) {

            System.out.println("Enter first number to add: ");
            int num1 = myScanner.nextInt();

            System.out.println("Enter second number to add: ");
            int num2 = myScanner.nextInt();

            int sum = num1 + num2;

            System.out.println("The answer is: " +  sum);
        }
        else if (choice.equalsIgnoreCase("S")) {

            System.out.println("Enter first number to subtract: ");
            int num1 = myScanner.nextInt();

            System.out.println("Enter second number to subtract: ");
            int num2 = myScanner.nextInt();

            int sum = num1 + num2;

            System.out.println("The answer is: " +  sum);
        }

    }
}

