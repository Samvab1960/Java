// q11.java

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number N
        System.out.print("Enter a number N to find the sum of even numbers from 1 to N: ");
        int N = scanner.nextInt();
        int sum = 0;

        // Loop to find the sum of even numbers from 1 to N
        for (int i = 2; i <= N; i += 2) {
            sum += i;  // Add the current even number to the sum
        }

        // Output the sum of even numbers
        System.out.println("The sum of even numbers from 1 to " + N + " is: " + sum);

        scanner.close();
    }
}
