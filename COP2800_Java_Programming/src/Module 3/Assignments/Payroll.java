import java.util.Scanner;

/****************************************************************************************************
 * Homework 3: Payroll Bonus Program By: Antoine Gustave File Name: Payroll.java
 * Function: This program will calculate the bonus amount given a number of
 * employees
 ******************************************************************************************************/

public class Payroll {

    public static void main(String[] args) {
        System.out.println("Welcome to Payroll!");
        System.out.println("Please enter the number of employees: ");
        bonus();
    }

    public static void bonus() {
        Scanner userInput = new Scanner(System.in);
        int totalEmployees = 0;
        int employeesYears = 0;
        double bonus = 0.0;
        double currentPay = 0.0;
        double newPay = 0.0;

        try {

            totalEmployees = userInput.nextInt();

            for (int i = 0; i < totalEmployees; i++) {

                int numEmployee[] = new int[totalEmployees];
                ++numEmployee[i];

                System.out.println("Please enter employee " + numEmployee[i] + "’s monthly pay: ");
                currentPay = userInput.nextDouble();
                System.out.println("Please enter the number of years employee " + numEmployee[i] + " has worked: ");
                employeesYears = userInput.nextInt();

                if (employeesYears >= 0 && employeesYears <= 4) {
                    bonus = .05;
                    bonus = currentPay * bonus;
                    newPay = currentPay + bonus;
                    System.out.println("Employee " + numEmployee[i]
                            + " eceives a 5 % bonus, bringing their monthly pay to $" + newPay);

                } else if (employeesYears >= 5 && employeesYears <= 9) {
                    bonus = .10;
                    bonus = currentPay * bonus;
                    newPay = currentPay + bonus;
                    System.out.println("Employee " + numEmployee[i]
                            + " receives a 10% bonus, bringing their monthly pay to $" + newPay);

                } else if (employeesYears >= 10) {
                    bonus = .15;
                    bonus = currentPay * bonus;
                    newPay = currentPay + bonus;
                    System.out.println("Employee " + numEmployee[i]
                            + " receives a 15% bonus, bringing their monthly pay to $" + newPay);

                } else {
                    System.out.println("Invalid input.");
                }
            }
        } finally {
            userInput.close();
        }

    }
}
