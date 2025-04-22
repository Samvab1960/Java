// q16.java

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Initialize the GCD variable
        int gcd = 1;

        // Loop to find the GCD
        for (int i = 1; i <= num1 && i <= num2; i++) {
            // If i divides both numbers, it is a common divisor
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;  // Update the GCD
            }
        }

        // Output the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}
