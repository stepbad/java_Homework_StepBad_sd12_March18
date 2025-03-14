/**
 * MathUtils provides static mathematical utility functions,
 * including a factorial method with proper exception handling.
 * 
 * @author Stephen Badcock
 * @version 1.0
 */
public class MathUtils {

    /**
     * Computes the factorial of a given number.
     * 
     * @param n The number for which factorial is to be computed.
     * @return The factorial of n.
     * @throws IllegalArgumentException If n is negative or greater than 16.
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Factorial result is too large for int.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
