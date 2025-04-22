// q63.java
import java.util.Scanner;

public class q63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the square
        System.out.print("Enter the size of the square (N): ");
        int N = scanner.nextInt();

        // Print a square of stars using nested loops
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
