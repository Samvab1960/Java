// q17.java

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Initialize the LCM variable
        int lcm = 0;

        // Find the maximum of num1 and num2 to start the loop from there
        int max = (num1 > num2) ? num1 : num2;

        // Loop to find the LCM
        while (true) {
            // If max is divisible by both num1 and num2, it's the LCM
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;  // Set the LCM to max
                break;      // Exit the loop as we've found the LCM
            }
            max++;  // Increment max by 1
        }

        // Output the LCM
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }
}
