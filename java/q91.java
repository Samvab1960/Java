import java.util.Scanner;

public class q91 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input number as a string
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        
        // Call method to find the sum of digits at even indexes
        int sum = sumDigitsAtEvenIndexes(number);
        
        // Output the sum
        System.out.println("Sum of digits at even indexes: " + sum);
        
        // Close the scanner
        scanner.close();
    }

    // Method to calculate the sum of digits at even indexes
    public static int sumDigitsAtEvenIndexes(String number) {
        int sum = 0;
        
        // Iterate through the string representation of the number
        for (int i = 0; i < number.length(); i++) {
            // Check if the index is even
            if (i % 2 == 0) {
                // Add the digit at the even index to the sum
                sum += Character.getNumericValue(number.charAt(i));
            }
        }
        
        return sum;
    }
}
