// q79.java
import java.util.Scanner;

public class q79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the pattern
        System.out.print("Enter the size of the X pattern (odd number preferred): ");
        int size = scanner.nextInt();

        // Loop to print the X pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == (size - 1 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line
        }

        scanner.close();
    }
}
