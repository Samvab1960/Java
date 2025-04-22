// q60.java
import java.util.Scanner;

public class q60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input the character to count
        System.out.print("Enter the character to count: ");
        char characterToCount = scanner.next().charAt(0);

        // Initialize counter for character occurrences
        int count = 0;

        // Loop through the string and count the occurrences of the character
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == characterToCount) {
                count++;
            }
        }

        // Output the result
        System.out.println("The character '" + characterToCount + "' appears " + count + " time(s) in the string.");

        scanner.close();
    }
}
