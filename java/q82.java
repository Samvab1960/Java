// q82.java
import java.util.Scanner;

public class q82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows for the alternating star pattern: ");
        int rows = scanner.nextInt();

        // Print alternating star pattern
        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) {
                System.out.print(" "); // add leading space on even rows
            }

            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println(); // next line after each row
        }

        scanner.close();
    }
}
