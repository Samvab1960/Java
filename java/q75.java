// q75.java
import java.util.Scanner;

public class q75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the half pyramid
        System.out.print("Enter the number of rows for the half-pyramid: ");
        int rows = scanner.nextInt();

        // Loop to print the half-pyramid pattern
        for (int i = 1; i <= rows; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
