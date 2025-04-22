// q13.java

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number N
        System.out.print("Enter a number N to display all prime numbers from 1 to N: ");
        int N = scanner.nextInt();

        // Loop to check for prime numbers
        System.out.println("Prime numbers from 1 to " + N + " are:");

        // Iterate through numbers from 2 to N
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;  // No need to check further if num is divisible by i
                }
            }

            // If num is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
