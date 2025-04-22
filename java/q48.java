// q48.java
import java.util.Scanner;

public class q48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop through each row to print the triangular pattern
        int number = 1; // Start with 1

        for (int i = 1; i <= rows; i++) {
            // Print numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment number
            }
            System.out.println(); // New line after each row
        }

        scanner.close();
    }
}
