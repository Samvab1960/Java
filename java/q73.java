// q73.java
import java.util.Scanner;

public class q73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows for the zig-zag pattern: ");
        int rows = scanner.nextInt();

        // Loop to create the zig-zag pattern
        for (int i = 0; i < rows; i++) {
            // Print stars for the left side of the zig-zag
            if (i % 2 == 0) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }

            // Print stars for the right side of the zig-zag
            for (int j = 0; j < rows - 1; j++) {
                if (i % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
