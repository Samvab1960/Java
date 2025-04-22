// q47.java
import java.util.Scanner;

public class q47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert number to string to easily calculate the number of digits
        String numStr = Integer.toString(number);
        int numDigits = numStr.length();

        int sum = 0;
        int temp = number;

        // Calculate the sum of each digit raised to the power of the number of digits
        while (temp > 0) {
            int digit = temp % 10;  // Extract the last digit
            sum += Math.pow(digit, numDigits);  // Add the power of the digit to the sum
            temp /= 10;  // Remove the last digit
        }

        // Check if the number is equal to the sum of its digits raised to the power
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
