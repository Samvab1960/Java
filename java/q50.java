// q50.java
import java.util.Scanner;

public class q50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1;
        int sum = 0;

        // Calculate the sum of the first N Fibonacci numbers
        for (int i = 1; i <= N; i++) {
            sum += a;  // Add the current Fibonacci number to the sum
            int next = a + b;  // Calculate the next Fibonacci number
            a = b;  // Move to the next Fibonacci number
            b = next;  // Move to the next Fibonacci number
        }

        // Output the sum
        System.out.println("The sum of the first " + N + " Fibonacci numbers is: " + sum);

        scanner.close();
    }
}
