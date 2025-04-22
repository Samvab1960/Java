// File: q25.java

import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int result = 0;

        // Count the number of digits
        int digits = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Calculate the sum of the digits raised to the power of 'digits'
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check if it's an Armstrong number
        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
