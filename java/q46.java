// q46.java
import java.util.Scanner;

public class q46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the sum of divisors
        int sumOfDivisors = 0;

        // Loop through all numbers from 1 to number/2
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i; // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors equals the number
        if (sumOfDivisors == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }
}
