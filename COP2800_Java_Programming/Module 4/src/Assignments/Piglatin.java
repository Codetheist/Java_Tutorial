
/****************************************************************************************************
 * Homework 4: Pig Latin Program By: Antoine Gustave File Name: PigLatin.java
 * Function: This program converts Strings to Pig Latin
 ******************************************************************************************************/

import java.util.Scanner;

public class PigLatin {

    String translatePhrase = "";
    String originalPhrase = "";

    public static void main(String[] args) {
        PigLatin pl = new PigLatin();
        pl.origin();
        pl.convert();
        pl.translateDisplay();
    }

    public String origin() {
        Scanner userInput = new Scanner(System.in);

        try {
            System.out.println("Pig Latin Converter!");

            System.out.println();

            System.out.println("Enter your phrase: ");
            originalPhrase = userInput.nextLine();
            originalPhrase = originalPhrase.toLowerCase();

            return originalPhrase;

        } finally {
            userInput.close();
        }
    }

    public String translation(String originalPhrase) {

        if (originalPhrase.startsWith("a") || originalPhrase.startsWith("e") || originalPhrase.startsWith("i")
                || originalPhrase.startsWith("o") || originalPhrase.startsWith("u")) {

            translatePhrase = originalPhrase + "way";

        } else {

            translatePhrase = originalPhrase.substring(1) + originalPhrase.charAt(0) + "ay";
        }

        return translatePhrase;

    }

    public void convert() {
        String[] storedWords = originalPhrase.split(" ");
        for (int i = 0; i < storedWords.length; i++) {
            translatePhrase += translation(storedWords[i]) + " ";
        }
    }

    public void translateDisplay() {

        System.out.println();

        System.out.println("Your original input: " + originalPhrase);

        System.out.println();

        System.out.println("Translated output: " + translatePhrase);
    }

}
