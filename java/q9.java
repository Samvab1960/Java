// q9.java

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string to count the number of vowels: ");
        String input = scanner.nextLine();
        
        int vowelCount = 0;

        // Loop through the string to count vowels
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Get the character at the current position

            // Check if the character is a vowel (both uppercase and lowercase)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;  // Increment vowel count
            }
        }

        // Output the result
        System.out.println("The number of vowels in the string is: " + vowelCount);

        scanner.close();
    }
}
