// q55.java
import java.util.Scanner;

public class q55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop to print the inverted pyramid
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces for alignment
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
