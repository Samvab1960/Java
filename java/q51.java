// q51.java
import java.util.Scanner;

public class q51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Calculate and print the numbers in each row
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Pascal's Triangle formula
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
