// q40.java
import java.util.Scanner;

public class q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("All possible substrings are:");

        // Loop through all possible substrings
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                // Print the substring from index i to j
                System.out.println(input.substring(i, j));
            }
        }

        scanner.close();
    }
}
