import java.util.Scanner;

public class q99 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Count the occurrences of each character
        countCharacterOccurrences(input);
        
        // Close the scanner
        scanner.close();
    }

    // Method to count the occurrences of each character
    public static void countCharacterOccurrences(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();
        
        // Loop through the array to count occurrences
        boolean[] visited = new boolean[str.length()];
        
        System.out.println("Character Occurrences:");
        
        for (int i = 0; i < str.length(); i++) {
            // Skip already visited characters
            if (visited[i]) {
                continue;
            }
            
            int count = 1;  // Initialize count to 1 for the current character
            
            // Loop to count the occurrence of the current character
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    visited[j] = true;  // Mark this character as visited
                }
            }
            
            // Print the character and its count
            System.out.println(chars[i] + ": " + count);
        }
    }
}
