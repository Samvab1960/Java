// q64.java
import java.util.Scanner;

public class q64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;

        // Print increasing number pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
