// q71.java
import java.util.Scanner;

public class q71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the checkerboard
        System.out.print("Enter the size of the checkerboard (N x N): ");
        int N = scanner.nextInt();

        // Loop to print the checkerboard pattern
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Check if the sum of row and column indices is even or odd
                if ((i + j) % 2 == 0) {
                    System.out.print("X ");  // Print 'X' for even indices
                } else {
                    System.out.print("O ");  // Print 'O' for odd indices
                }
            }
            System.out.println();  // Move to the next line after each row
        }

        scanner.close();
    }
}
