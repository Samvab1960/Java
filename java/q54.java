// q54.java
import java.util.Scanner;

public class q54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string contains only digits
        if (input.matches("\\d+")) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does not contain only digits.");
        }

        scanner.close();
    }
}
