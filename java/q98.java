import java.util.Scanner;

public class q98 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of rows for the triangle pattern
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Print the number pattern resembling a triangle
        printTrianglePattern(rows);
        
        // Close the scanner
        scanner.close();
    }

    // Method to print the triangle number pattern
    public static void printTrianglePattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for the right alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
