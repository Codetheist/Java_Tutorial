
/****************************************************************************************************
 * Homework 4: Pig Latin Program By: Antoine Gustave File Name: Piglatin.java
 * Function: This program converts Strings to Pig Latin
 ******************************************************************************************************/

import java.util.Scanner;
//import javax.swing.JOptionPane;
import java.util.Arrays;

public class Piglatin {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String originalPhrase = "";
        int spacePos = originalPhrase.indexOf(" ");
        final int ARR_SIZE = 10;
        String arr[] = new String[ARR_SIZE];

        try {
            System.out.println("Pig Latin Converter!");
            System.out.println();

            System.out.println("Please enter a phrase to be converted:");
            originalPhrase = userInput.nextLine();

            int i = 0;

            while (originalPhrase.length() > 0) {

                if (spacePos > 0) {
                    arr[i] = originalPhrase.substring(0, spacePos);
                    originalPhrase = originalPhrase.substring(spacePos + 1);

                } else {

                    if (originalPhrase.length() > 0) {
                        arr[i] = originalPhrase.substring(0);
                        originalPhrase = "";
                    }
                }
                i++;
            }

            // Pig latin translation

        } finally {
            userInput.close();
        }

        // System.out.println("Initial word: " + originPhrase);
        // System.out.println("Pig Latin translation: " + translatedPhrase);
    }
}