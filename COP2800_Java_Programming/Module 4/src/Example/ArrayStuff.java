import java.util.Scanner;
import java.util.Arrays;

public class ArrayStuff {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int GRADE_SIZE = 5;
        final int STUD_SIZE = 3;
        int[][] gradeBook = new int[STUD_SIZE][GRADE_SIZE];

        try {
            for (int rows = 0; rows < STUD_SIZE; rows++) {
                System.out.println("Enter student " + (rows + 1) + " grades.");

                for (int col = 0; col < STUD_SIZE; col++) {
                    gradeBook[rows][col] = scan.nextInt();
                }
            }

            System.out.println();

            for (int rows = 0; rows < STUD_SIZE; rows++) {

                for (int col = 0; col < STUD_SIZE; col++) {
                    System.out.println(gradeBook[rows][col] + " ");
                }
                System.out.println();
            }
            /*
             * int[] grades1 = {90, 70, 60, 50, 40}; int[] grades2 = {90, 70, 60, 50, 40};
             * boolean isGradesEqual = true;
             * 
             * if(Arrays.equals(grades1, grades2)) {
             * System.out.println("Arrays are equal!"); }else{
             * System.out.println("Arrays are NOT equal!"); }
             */

            /*
             * final int SIZE = 5; int[] grades = new int[SIZE];
             * 
             * try { for (int i = 0; i < SIZE; i++) {
             * System.out.println("Please enter a grade " + (i + 1)); grades[i] =
             * scan.nextInt(); }
             * 
             * System.out.println();
             * 
             * for (int i = 0; i < SIZE; i++) { System.out.println("Your grade is " +
             * grades[i]); }
             * 
             * System.out.println();
             * 
             * Arrays.sort(grades);
             * 
             * System.out.println();
             * 
             * for (int i = 0; i < SIZE; i++) { System.out.println("Your grade is " +
             * grades[i]); }
             * 
             * System.out.println("Position of 70 is " + Array.binarySearch(grades, 70));
             */
        } finally {
            scan.close();
        }
    }
}