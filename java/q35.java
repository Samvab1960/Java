// q35.java
import java.util.Scanner;

public class q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the limit
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int primeCount = 0;

        // Loop through numbers from 2 to the given number
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        // Output the number of prime numbers
        System.out.println("Number of prime numbers up to " + number + ": " + primeCount);

        scanner.close();
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
