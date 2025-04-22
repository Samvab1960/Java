import java.util.Scanner;

public class q94 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Call the method to find the number of non-zero digits
        int nonZeroDigitCount = countNonZeroDigits(number);
        
        // Output the result
        System.out.println("The number of non-zero digits is: " + nonZeroDigitCount);
        
        // Close the scanner
        scanner.close();
    }

    // Method to count the number of non-zero digits
    public static int countNonZeroDigits(long number) {
        int count = 0;

        // Convert the number to a string to easily iterate through each digit
        String numStr = String.valueOf(number);

        // Iterate through each character in the string
        for (char digit : numStr.toCharArray()) {
            // Check if the digit is not '0'
            if (digit != '0') {
                count++;
            }
        }

        return count;
    }
}
