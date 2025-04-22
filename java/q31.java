// q31.java
import java.util.Scanner;

public class q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        int digitCount = 0;

        // Special case for 0
        if (number == 0) {
            digitCount = 1;
        } else {
            // Loop to count digits
            while (number > 0) {
                number /= 10;
                digitCount++;
            }
        }

        // Output result
        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
