// q59.java
import java.util.Scanner;

public class q59 {
    
    // Recursive function to get the Fibonacci number at position n
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n; // Base case: Fibonacci of 0 is 0, Fibonacci of 1 is 1
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive case
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Print Fibonacci series using a recursive approach
        System.out.println("Fibonacci series using recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        System.out.println(); // Line break
        
        // Print Fibonacci series using a loop (iterative approach)
        System.out.println("Fibonacci series using loops:");
        int first = 0, second = 1;
        System.out.print(first + " " + second + " "); // Print the first two numbers
        
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second; // Move the second number to first
            second = next; // Move the next number to second
        }

        scanner.close();
    }
}
