// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each number.
// Handles invalid inputs, including negative numbers and values over 16.
// ****************************************************************

import java.util.Scanner;

/**
 * The Factorials program reads integers from user input, calculates 
 * the factorial of each number, and handles invalid inputs using 
 * exception handling. Factorial calculations are done via the MathUtils class.
 * 
 * @author Stephen Badcock
 * @version 1.0
 */
public class Factorials {

    /**
     * The main method reads integers from the user, computes factorials,
     * and handles exceptions for invalid inputs.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        String keepGoing = "y"; // User's choice to continue
        Scanner scan = new Scanner(System.in);

        // Loop for user input until they choose to stop
        while (keepGoing.equalsIgnoreCase("y")) {
            try {
                // Prompt user for input
                System.out.print("Enter an integer: ");
                int val = scan.nextInt(); // Read input integer

                // Compute and display factorial
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));

            } catch (IllegalArgumentException e) {
                // Handle invalid inputs (negative numbers or values > 16)
                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {
                // Handle unexpected exceptions
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Clear invalid input to prevent infinite loop
            }

            // Prompt user for continuation
            System.out.print("Another factorial? (y/n): ");
            keepGoing = scan.next();
        }

        scan.close(); // Close scanner
    }
}
