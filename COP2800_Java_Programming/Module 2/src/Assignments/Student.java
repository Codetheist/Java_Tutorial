/****************************************************************************************************
 * Homework 2: Student Enrollment
 * Program By: Antoine Gustave
 * File Name: Student.java
 * Function: This program enrolls a student with basic information
 ***************************************************************************************************/

import java.util.Scanner;

public class Student {

    private String name;
    private double gpa;
    private String grade;

    public static void main(String[] args) {

        Student newStudent = new Student();
        newStudent.enroll();
        newStudent.displayInfo();

    }

    public Student() {
        name = "";
        gpa = 0.0;
        grade = "";
    }

    public void enroll() {
		Scanner userInput = new Scanner(System.in);
		try {
			System.out.println("Welcome to Student Enrollment!");
            System.out.println("Enter Student’s name: ");
            name = userInput.nextLine();
            System.out.println("Enter Student’s gpa: ");
            gpa = userInput.nextDouble();
            System.out.println("Enter Student’s grade: ");
            grade = userInput.next();
			
		} finally {
			userInput.close();
		}
	}

    public void displayInfo() {
        System.out.println(name + " has a gpa of " + gpa + " and is in the " + grade + " grade.");
	}

}
