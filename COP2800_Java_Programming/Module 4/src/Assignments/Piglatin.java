
/****************************************************************************************************
 * Homework 4: Pig Latin Program By: Antoine Gustave File Name: Piglatin.java
 * Function: This program converts Strings to Pig Latin
 ******************************************************************************************************/

import java.util.Scanner;

public class Piglatin {
    String originalPhrase;
    String translatedPhrase;

    public static void main(String[] args) {
        Piglatin newTranslation = new Translator();
        newTranslation.translation();
        newTranslation.displayInfo();
    }

    public Translator() {
        originalPhrase = "";
        translatedPhrase = "";
    }

    public void translation() {
        Scanner userInput = new Scanner(System.in);

        try {
            System.out.println("Pig Latin Converter!");
            System.out.println();

            System.out.println("Please enter a phrase to be converted:");
            originalPhrase = userInput.nextLine();

        } finally {
            userInput.close();
        }
    }

    public void displayInfo() {
        System.out.println("Your new phrase in Pig Latin:");
    }
}