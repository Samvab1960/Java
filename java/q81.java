// q81.java
import java.util.Scanner;

public class q81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Print the reversed string using a for loop
        System.out.print("Reversed string: ");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

        System.out.println(); // New line after output
        scanner.close();
    }
}
