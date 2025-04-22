// q66.java
import java.util.Scanner;

public class q66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of N
        System.out.print("Enter the number of even numbers to sum: ");
        int N = scanner.nextInt();

        int sum = 0;
        int even = 2; // Start with the first even number
        int count = 0;

        // Loop to sum the first N even numbers
        while (count < N) {
            sum += even;
            even += 2;
            count++;
        }

        // Output the result
        System.out.println("The sum of the first " + N + " even numbers is: " + sum);

        scanner.close();
    }
}
