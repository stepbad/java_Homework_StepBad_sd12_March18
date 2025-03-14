// ****************************************************************
// CountLetters.java
//
// Reads a word from the standard input and prints the number of
// occurrences of each letter in that word, handling exceptions.
// ****************************************************************

import java.util.Scanner;

/**
 * This program reads a word from the user, converts it to uppercase, 
 * and counts the occurrences of each letter. It handles non-letter 
 * characters using exception handling.
 * 
 * @author Stephen Badcock
 * @version 1.0
 */
public class CountLetters {

    /**
     * Main method that reads a word from user input and counts letter occurrences.
     * It handles non-letter characters by catching ArrayIndexOutOfBoundsException.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array to store letter frequencies
        Scanner scan = new Scanner(System.in);

        // Get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // Convert to all uppercase
        word = word.toUpperCase();

        /**
         * Loops through each character, updating the count if it's a letter.
         * Catches and handles non-letter characters.
         */
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++; // Index into the array
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        // Print letter frequencies
        System.out.println("\nLetter Frequencies:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }

        scan.close(); // Close scanner to prevent resource leaks
    }
}
