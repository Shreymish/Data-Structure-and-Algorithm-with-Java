public class Patternn {

    // 1. Hollow Rectangle Pattern
    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 2. Inverted Rotated Half Pyramid
    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3. Inverted Pyramid with Numbers
    public static void inverted_pyramid_withNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 4. Floyd's Triangle
    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 5. Zero-One Triangle
    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // 6. Solid Rhombus
    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // solid stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 7. Hollow Rhombus (FIXED)
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // leading spaces to slant the rhombus
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // the rhombus row
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");   // border
                } else {
                    System.out.print(" ");   // hollow
                }
            }
            // end of this row
            System.out.println();
        }
    }
     public static void diamond(int n) {
        // Upper half (including middle line)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print increasing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // test whichever patterns you like:
        System.out.println("Hollow Rectangle:");
        hollow_rectangle(5, 10);
        System.out.println("\nInverted Rotated Half Pyramid:");
        inverted_rotated_half_pyramid(4);
        System.out.println("\nInverted Number Pyramid:");
        inverted_pyramid_withNumbers(5);
        System.out.println("\nFloyd's Triangle:");
        floyds_triangle(5);
        System.out.println("\nZero-One Triangle:");
        zero_one_triangle(5);
        System.out.println("\nSolid Rhombus:");
        solid_rhombus(5);
        System.out.println("\nHollow Rhombus:");
        hollow_rhombus(5);
        diamond(5); 
    }
}
// Source: https://chatgpt.com/share/688f3603-4e3c-8006-bbf0-b6359582af51
// This code is a collection of various patterns in Java.   
//https://chatgpt.com/share/688f3603-4e3c-8006-bbf0-b6359582af51