public class Patternn {

    // 1. Hollow Rectangle Pattern
    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                // Print star for first/last row OR first/last column
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line after each row
        }
    }

    // 2. Inverted Rotated Half Pyramid
    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
    public static void inverted_pyramid_withNumbers(int n){
        for (int i = 1; i<=n; i++){
            for (int j= 1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
            
        }
    }

    // 3. main method
    public static void main(String args[]) {
        hollow_rectangle(5, 10); // You can change size
        System.out.println();    // Just a line space
        inverted_rotated_half_pyramid(4);

    inverted_pyramid_withNumbers(5); // You can change size
        // Add more patterns here as needed
    }
}
//5