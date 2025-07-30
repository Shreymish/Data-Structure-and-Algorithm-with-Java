import java.util.Scanner;

// Class names should start with an uppercase letter (convention)
public class Function {

    /**
     * Calculates the sum of two integers.
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The sum of num1 and num2.
     */
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // Return the calculated sum
    }

    /**
     * The main method is the entry point of the program.
     * @param args Command line arguments (not used here).
     */
    public static void main(String[] args) { // Using String[] is a common style
        Scanner sc = new Scanner(System.in);

        // --- PART 1: CALCULATE SUM ---
        System.out.println("--- Sum Calculation ---");
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt(); // Read the first integer from the user

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt(); // Read the second integer from the user

        // Call the calculateSum method with 'a' and 'b' as arguments
        int totalSum = calculateSum(a, b);

        // Print the sum result
        System.out.println("The sum of " + a + " and " + b + " is: " + totalSum);
        System.out.println(); // Add a blank line for better readability

        // --- PART 2: SWAP NUMBERS ---
        System.out.println("--- Number Swapping ---");
        System.out.println("Original values: a = " + a + ", b = " + b);

        // The classic way to swap two numbers using a temporary variable
        int temp = a; // 1. Store the value of 'a' in a temporary variable
        a = b;        // 2. Assign the value of 'b' to 'a'
        b = temp;     // 3. Assign the stored original value of 'a' (from temp) to 'b'

        // Print the swapped result
        System.out.println("Swapped values:  a = " + a + ", b = " + b);

        sc.close(); // Close the scanner to prevent resource leaks
    }  
}
