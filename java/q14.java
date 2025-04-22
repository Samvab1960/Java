// q14.java

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = true;

        // Handle cases for numbers less than 2
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to the square root of the number to check for divisibility
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;  // No need to check further if num is divisible by i
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
}
