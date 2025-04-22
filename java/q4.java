// q4.java

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        int reversedNumber = 0;

        // Loop to reverse the number
        for (; num != 0; num /= 10) {
            int digit = num % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit to the reversed number
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);
        
        scanner.close();
    }
}
