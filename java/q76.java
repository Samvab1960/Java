// q76.java
import java.util.Scanner;

public class q76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the inverted half-pyramid
        System.out.print("Enter the number of rows for the inverted half-pyramid: ");
        int rows = scanner.nextInt();

        // Loop to print the inverted half-pyramid pattern
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        scanner.close();
    }
}
