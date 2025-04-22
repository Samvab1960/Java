// q56.java
import java.util.Scanner;

public class q56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Initialize the number
        int i = 1;

        // Print numbers from 1 to N using a do-while loop
        do {
            System.out.println(i);  // Print the current number
            i++;  // Increment the number
        } while (i <= N);  // Continue while i is less than or equal to N

        scanner.close();
    }
}
