// q74.java
import java.util.Scanner;

public class q74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms in the Fibonacci sequence
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Initialize the first two Fibonacci numbers
        int first = 0, second = 1;

        // Print the Fibonacci sequence
        System.out.print("Fibonacci Sequence: ");
        
        int count = 0;
        while (count < terms) {
            System.out.print(first + " ");
            
            // Update the Fibonacci numbers
            int next = first + second;
            first = second;
            second = next;
            
            count++;
        }

        scanner.close();
    }
}
