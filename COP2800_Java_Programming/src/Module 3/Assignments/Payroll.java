import java.util.Scanner;

/****************************************************************************************************
 * Homework 3: Payroll Bonus Program By: Antoine Gustave File Name: Payroll.java
 * Function: This program will calculate the bonus amount given a number of
 * employees
 ******************************************************************************************************/

public class Payroll {

    public static void main(String[] args) {
        bonus();
    }

    public static void bonus() {
        Scanner userInput = new Scanner(System.in);
        double totalEmployees = 0.0;
        double employeesYears = 0.0;
        double bonus = 0.0;
        double currentPay = 0.0;
        double newPay = 0.0;

        for (int i = 0; i < totalEmployees; i++) {
            if (employeesYears == 0 && employeesYears <= 4) {
                bonus = .05;
                bonus = currentPay * bonus;
                newPay = currentPay + bonus;
            } else if (employeesYears == 5 && employeesYears <= 9) {
                bonus = .10;
                bonus = currentPay * bonus;
                newPay = currentPay + bonus;
            } else if (employeesYears >= 10) {
                bonus = .15;
                bonus = currentPay * bonus;
                newPay = currentPay + bonus;
            } else {
                System.out.println("Invalid input.");
            }
        }

        try {
            System.out.println("Welcome to Payroll!");
            System.out.println("Please enter the number of employees: ");
            totalEmployees = userInput.nextDouble();
            System.out.println("Please enter employee 1’s monthly pay: ");
            currentPay = userInput.nextDouble();
            System.out.println("Please enter the number of years employee 1 has worked: ");
            employeesYears = userInput.nextDouble();
            System.out.println("Employee one receives a 5 % bonus, bringing their monthly pay to $" + newPay);
            System.out.println("Please enter employee 2’s monthly pay: ");
            currentPay = userInput.nextDouble();
            System.out.println("Please enter the number of years employee 2 has worked: ");
            employeesYears = userInput.nextDouble();
            System.out.println("Employee one receives a 15% bonus, bringing their monthly pay to $" + newPay);
            System.out.println("Please enter employee 3’s monthly pay: ");
            currentPay = userInput.nextDouble();
            System.out.println("Please enter the number of years employee 3 has worked: ");
            employeesYears = userInput.nextDouble();
            System.out.println("Employee one receives a 10% bonus, bringing their monthly pay to $" + newPay);
        } finally {
            userInput.close();
        }

    }
}