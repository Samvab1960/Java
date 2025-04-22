import java.util.Scanner;

public class q95 {

    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the number N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        // Print Fibonacci numbers using recursion
        System.out.println("Fibonacci numbers using recursion:");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        // Print Fibonacci numbers using loops
        System.out.println("Fibonacci numbers using loops:");
        fibonacciUsingLoop(N);
        
        // Close the scanner
        scanner.close();
    }

    // Recursive method to find the nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;  // Base case: Fibonacci of 0 is 0, Fibonacci of 1 is 1
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);  // Recursive case
    }

    // Method to print Fibonacci numbers using loops
    public static void fibonacciUsingLoop(int N) {
        int a = 0, b = 1;
        
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
