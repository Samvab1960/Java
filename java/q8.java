// q8.java

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number to find the sum of its digits: ");
        int num = scanner.nextInt();
        int sum = 0;

        // While loop to calculate the sum of digits
        while (num != 0) {
            sum += num % 10;  // Add the last digit to sum
            num /= 10;        // Remove the last digit from num
        }

        // Output the sum of digits
        System.out.println("The sum of the digits is: " + sum);

        scanner.close();
    }
}
