// q5.java

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        long factorial = 1;  // Using long to handle large factorials

        // For loop to calculate the factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Multiply factorial by current number
        }

        // Output the factorial
        System.out.println("The factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}
