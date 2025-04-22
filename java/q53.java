// q53.java
import java.util.Scanner;

public class q53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number N
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        // Initialize sum variables
        int evenSum = 0;
        int oddSum = 0;

        // Loop through numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                evenSum += i; // Add to even sum if the number is even
            } else {
                oddSum += i; // Add to odd sum if the number is odd
            }
        }

        // Calculate the difference
        int difference = evenSum - oddSum;

        // Output the difference
        System.out.println("The difference between the sum of even and odd numbers is: " + difference);

        scanner.close();
    }
}
