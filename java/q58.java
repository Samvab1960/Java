// q58.java
import java.util.Scanner;

public class q58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        // Create and fill the matrix with numbers in diagonal pattern
        int[][] matrix = new int[n][n];

        // Loop through to fill the diagonal elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 1;  // Place 1 on the diagonal
                } else {
                    matrix[i][j] = 0;  // Place 0 for other elements
                }
            }
        }

        // Print the matrix
        System.out.println("Square matrix in diagonal pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
