// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the sum of the integers in the line.
// Handles non-integer values using exception handling.
// ****************************************************************

import java.util.Scanner;

/**
 * The ParseInts program reads a line of text entered by the user, 
 * extracts integers from the line, sums them, and prints the result.
 * It handles non-integer inputs by skipping them.
 * 
 * @author Stephen Badcock
 * @version 1.0
 */
public class ParseInts {

    /**
     * The main method prompts the user to enter a line of text, extracts
     * and sums the integers while handling non-integer inputs.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        int val, sum = 0;

        // Create scanner for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text with numbers in it to sum them:");

        // Read full input line
        String line = scan.nextLine();
        Scanner scanLine = new Scanner(line); // separates the input line

        // Process each piece, parsing integers while handling exceptions
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next()); // Attempt to parse an integer
                sum += val; // Add valid integers to sum
            } catch (NumberFormatException e) {
                System.out.println("Skipping non-integer value.");
            }
        }

        // Print the sum of all valid integers found
        System.out.println("The sum of the integers on this line is " + sum);

        // Close scanners
        scan.close();
        scanLine.close();
    }
}
