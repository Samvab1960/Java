// q10.java

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();
        
        // Convert input string to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Initialize variables
        boolean isPalindrome = true;
        int length = input.length();

        // Loop to check characters from both ends
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                isPalindrome = false;
                break;  // No need to check further if a mismatch is found
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
