// q70.java
import java.util.Scanner;

public class q70 {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create and input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Count prime numbers
        int primeCount = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                primeCount++;
            }
        }

        // Output the result
        System.out.println("Total number of prime numbers in the array: " + primeCount);

        scanner.close();
    }
}
