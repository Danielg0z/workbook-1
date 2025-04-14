package com.pluralsight;

public class MathApp {

    //All code for this exercise will be done in the Main method
    public static void main(String[] args) {
        // #1
       int bobSalary = 55000;
       int garySalary = 100000;
       int highSalary = Math.max(bobSalary, garySalary);

       System.out.println("The highest salary is " + highSalary);

       System.out.println("---------------------------------");
       // #2
        int carPrice = 40030;
        int truckPrice = 67000;
        System.out.println("the Lowest price between car and truck is" + (Math.min(carPrice,truckPrice)));

        System.out.println("---------------------------------");

       // #3 Find and display the area of a circle whose radius is 7.25
        double cirRadius = 7.25;
        double areaCircle = Math.PI * Math.pow(cirRadius,2);
        System.out.println("The area of a Circle is " + areaCircle);

        System.out.println("---------------------------------");

        // #4 Find and display the square root a variable after it is set to 5.0
        double var1 = 5.0;

        System.out.println("The square root of 5.0 is " + Math.sqrt(5.0));

        System.out.println("---------------------------------");

        // #5 Find and display the distance between the points (5, 10) and (85, 50)
        int firstX = 5;
        int firstY = 10;
        int secondX = 85;
        int secondY = 50;
        int Xportion = secondX - firstX;
        int Yportion = secondY - firstY;

        double distanceFormula = Math.sqrt(Math.pow(Xportion, 2) + Math.pow(Yportion, 2));

        System.out.println("The Distance is " + distanceFormula);

        System.out.println("---------------------------------");

        //Find and display the absolute (positive) value of a variable after it is set to -3.8

        double num = -3.8;

        System.out.println(Math.abs(num));

        System.out.println("---------------------------------");

        //Find and display a random number between 0 and 1

        //int randomNum = int(Math.random() * 2); // randomized number between 0 and 1
        int randomNum = (int)(Math.random() * 2);  // 0 to 2
        System.out.println(randomNum);

        System.out.println("---------------------------------");












    }
}
