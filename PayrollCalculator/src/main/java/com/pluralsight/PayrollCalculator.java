package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        /*
        Create a Java application named PayrollCalculator that prompts the user to enter:
− their name
− their hours worked (a floating point number)
− their pay rate (a floating point number) Calculate their gross pay.
Display the employee's name and their gross pay.
        */

        Scanner myScanner = new Scanner(System.in); // intialized scanner
        System.out.println("Enter your name: "); // asks a question
        String name = myScanner.nextLine();
        System.out.println("\nEnter your hours worked " + name + ": "); // asks a question
        int hoursWorked = myScanner.nextInt();
        System.out.println("\nEnter your Pay Rate $: " + name + ": "); // asks a question
        float payRate = myScanner.nextFloat();

        float grossPay = hoursWorked * payRate;



        if (hoursWorked > 40) {
            System.out.println("Your Making Overtime Money! Your payrate is : " + grossPay * 1.5f);
        }
        else {
            System.out.println("Hello: " + name + ", Your Gross Pay is: " + grossPay);
        }

    }
}
