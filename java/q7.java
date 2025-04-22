// q7.java

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for how many terms in the Fibonacci series to generate
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        // First two numbers of the Fibonacci series
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        // Generate Fibonacci series using a for loop
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            // Update values for the next term in the series
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

        scanner.close();
    }
}
