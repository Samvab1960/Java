// q12.java

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number N
        System.out.print("Enter a number N to find the sum of odd numbers from 1 to N: ");
        int N = scanner.nextInt();
        int sum = 0;
        int i = 1;  // Start with the first odd number

        // While loop to calculate the sum of odd numbers from 1 to N
        while (i <= N) {
            sum += i;  // Add the current odd number to the sum
            i += 2;    // Move to the next odd number
        }

        // Output the sum of odd numbers
        System.out.println("The sum of odd numbers from 1 to " + N + " is: " + sum);

        scanner.close();
    }
}
