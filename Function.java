import java.util.Scanner;

/**
 * This class contains methods for basic arithmetic and combinatorial operations.
 */
public class Function {

    /**
     * Calculates the sum of two integers.
     */
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Calculates the product of two integers.
     */
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    /**
     * Calculates the factorial of a non-negative integer.
     */
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial of a negative number is not defined.");
            return -1; // Indicate an error
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    /**
     * Checks if a given integer is a prime number.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates the binomial coefficient C(n, r).
     */
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        
        if (fact_n == -1 || fact_r == -1 || fact_nmr == -1) {
            return -1;
        }
        return fact_n / (fact_r * fact_nmr);
    }

    /**
     * Calculates the sum of two integers. (Overloaded)
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Calculates the sum of three integers. (Overloaded)
     */
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    /**
     * Converts a decimal number to its binary representation.
     */
    public static void decToBin(int decimalNum) {
        int myNum = decimalNum;
        int pow = 0;
        int binNum = 0;
        while (myNum > 0) {
            int rem = myNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            myNum = myNum / 2;
        }
        System.out.println("The binary form of " + decimalNum + " is: " + binNum);
    }

    /**
     * Converts a binary number to its decimal representation.
     */
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (myNum > 0) {
            int lastDigit = myNum % 10;
            if (lastDigit == 1) {
                decNum = decNum + (int) Math.pow(2, pow);
            }
            pow++;
            myNum = myNum / 10;
        }
        System.out.println("The decimal form of " + binNum + " is: " + decNum);
    }

    /**
     * The main method is the single entry point of the program.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        System.out.println(); 

        // --- Perform Calculations ---
        int initialSum = calculateSum(a, b);
        int product = multiply(a, b);

        // --- Display Results ---
        System.out.println("--- Results ---");
        System.out.println("The sum is: " + initialSum);
        System.out.println("The product is: " + product);
        System.out.println();

        // --- Demonstrate Swapping ---
        System.out.println("--- Number Swapping ---");
        System.out.println("Original values: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped values:  a = " + a + ", b = " + b);
        System.out.println();

        // --- Calculate Factorial ---
        System.out.println("--- Factorial Calculation ---");
        System.out.print("Enter a number to find its factorial: ");
        int factNum = sc.nextInt();
        int factResult = factorial(factNum);
        if (factResult != -1) {
            System.out.println("The factorial of " + factNum + " is: " + factResult);
        }
        System.out.println();
        
        // --- Calculate Binomial Coefficient ---
        System.out.println("--- Binomial Coefficient C(n, r) ---");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int coeffResult = binCoeff(n, r);
        if (coeffResult != -1) {
            System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + coeffResult);
        }
        System.out.println();

        // --- Demonstrate Method Overloading ---
        System.out.println("--- Method Overloading Demo ---");
        System.out.println("The sum of 3 and 5 is: " + sum(3, 5));
        System.out.println("The sum of 10, 20, and 30 is: " + sum(10, 20, 30));
        System.out.println();

        // --- Check for Prime Number ---
        System.out.println("--- Prime Number Check ---");
        System.out.print("Enter a number to check if it's prime: ");
        int primeCheckNum = sc.nextInt();
        if (isPrime(primeCheckNum)) {
            System.out.println(primeCheckNum + " is a prime number.");
        } else {
            System.out.println(primeCheckNum + " is not a prime number.");
        }
        System.out.println();

        // --- Decimal to Binary Conversion ---
        System.out.println("--- Decimal to Binary Conversion ---");
        System.out.print("Enter a number to convert to binary: ");
        int decNumToConvert = sc.nextInt();
        decToBin(decNumToConvert);
        System.out.println();

        // --- Binary to Decimal Conversion ---
        System.out.println("--- Binary to Decimal Conversion ---");
        System.out.print("Enter a binary number to convert to decimal: ");
        int binNumToConvert = sc.nextInt();
        binToDec(binNumToConvert);
        System.out.println();
        
        // --- Clean up ---
        System.out.println("--- End of Program ---");
        sc.close();
    }
}
// This code is a part of a Java program that performs various mathematical operations.
// It includes methods for addition, multiplication, factorial calculation, prime checking,
// binomial coefficient calculation, method overloading, and conversions between decimal and binary.
// The main method serves as the entry point, allowing user interaction to demonstrate these functionalities.
// The code is designed to be educational and illustrative of basic programming concepts in Java.
// The code is available at the following link for further reference:
//https://gemini.google.com/app/2abdefb279655260
        