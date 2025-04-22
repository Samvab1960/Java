// q67.java
import java.util.Scanner;

public class q67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of N
        System.out.print("Enter the number of odd numbers to sum: ");
        int N = scanner.nextInt();

        int sum = 0;
        int odd = 1; // Start with the first odd number
        int count = 0;

        // Loop to sum the first N odd numbers
        while (count < N) {
            sum += odd;
            odd += 2;
            count++;
        }

        // Output the result
        System.out.println("The sum of the first " + N + " odd numbers is: " + sum);

        scanner.close();
    }
}
