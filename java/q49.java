// q49.java
import java.util.Scanner;

public class q49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the minimum of the two numbers
        int min = Math.min(num1, num2);

        System.out.println("Common divisors of " + num1 + " and " + num2 + " are:");

        // Loop through all numbers from 1 to the minimum of num1 and num2
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
