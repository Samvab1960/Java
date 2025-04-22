// q33.java
import java.util.Scanner;

public class q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle negative input
        number = Math.abs(number);

        int sum = 0;

        // Loop to extract and check each digit
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) { // Check for odd digit
                sum += digit;
            }
            number /= 10;
        }

        // Output result
        System.out.println("Sum of odd digits: " + sum);

        scanner.close();
    }
}
