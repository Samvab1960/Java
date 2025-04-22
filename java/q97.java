import java.util.Scanner;

public class q97 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the value of N for the NxN matrix
        System.out.print("Enter the size of the matrix N: ");
        int N = scanner.nextInt();
        
        // Generate and print the multiplication matrix
        int[][] matrix = generateMultiplicationMatrix(N);
        
        // Print the matrix
        System.out.println("Multiplication Matrix (" + N + "x" + N + "):");
        printMatrix(matrix);
        
        // Close the scanner
        scanner.close();
    }

    // Method to generate the multiplication matrix
    public static int[][] generateMultiplicationMatrix(int N) {
        int[][] matrix = new int[N][N];
        
        // Fill the matrix with multiplication values
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = (i + 1) * (j + 1);  // Multiply row and column indices (1-based)
            }
        }
        
        return matrix;
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
