// q84.java
import java.util.Scanner;

public class q84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int sum = 0;

        // Extract and check each digit
        while (number > 0) {
            int digit = (int)(number % 10);
            if (digit % 3 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        // Output the result
        System.out.println("Sum of digits divisible by 3: " + sum);

        scanner.close();
    }
}
