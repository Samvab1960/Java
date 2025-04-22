// q41.java
import java.util.Scanner;

public class q41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Convert number to string to easily access digits at specific positions
        String numStr = Long.toString(number);
        int sum = 0;

        // Loop through the digits and sum those at even positions
        for (int i = 1; i < numStr.length(); i += 2) {
            sum += numStr.charAt(i) - '0';  // Convert char to int and add to sum
        }

        // Output the result
        System.out.println("Sum of digits at even positions: " + sum);

        scanner.close();
    }
}
