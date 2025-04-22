// q77.java
import java.util.Scanner;

public class q77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is a power of two
        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);

        // Output the result
        if (isPowerOfTwo) {
            System.out.println(num + " is a power of two.");
        } else {
            System.out.println(num + " is NOT a power of two.");
        }

        scanner.close();
    }
}
