import java.util.Scanner;

public class q88 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input number N
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        // Initialize the count of perfect squares
        int count = 0;
        
        // Find all perfect squares up to N
        for (int i = 1; i * i <= N; i++) {
            count++;
        }
        
        // Output the count of perfect squares
        System.out.println("Number of perfect squares up to " + N + ": " + count);
        
        // Close the scanner
        scanner.close();
    }
}
