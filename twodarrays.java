import java.util.*;

public class twodarrays {
    public static void main(String args[]) {
        int n = 3, m = 3;
        int[][] matrix = new int[n][m];
        Scanner sc = new Scanner(System.in);

        // Take input once
        System.out.println("Enter 9 elements for 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // ✅ now prints a newline after each row
        }

        sc.close(); // Optional but good
    }
}
