
/****************************************************************************************************
 Homework 1: Malachi’s Pizza Shop
 Program By: Antoine Gustave
 File Name: H1_PizzaShop.java
 Function: This program will calculate the number of slices based on a given pizza
 diameter and slice area.
 ******************************************************************************************************/

import java.util.Scanner;

public class H1_PizzaShop {

    public static void main(String[] args) {

        double PI = 3.14;
        int pizzaDiameter = 0;
        double sliceArea = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to Malachi’s Pizza Shop!");
        try {

            System.out.println("Please enter the DIAMETER of your pizza (inches): ");
            pizzaDiameter = userInput.nextInt();
            System.out.println("Please enter the Area of your desired pizza slice (inches): ");
            sliceArea = userInput.nextDouble();
            System.out.println();
        } finally {
            userInput.close();
        }

        double pizzaRadius = pizzaDiameter / 2;
        double pizzaArea = PI * Math.pow(pizzaRadius, 2);
        double numberOfSlices = pizzaArea / sliceArea;

        System.out.println("Your pizza has an AREA of " + pizzaArea + " inches sq.");
        System.out.println("You can evenly divide your pizza into " + (int) numberOfSlices
                + " slices based on your slice area of " + sliceArea + " inches sq.");
    }
}
