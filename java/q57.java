// q57.java
import java.util.Scanner;

public class q57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create the array and input the elements
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Count and print the number of digits in each number
        for (int i = 0; i < n; i++) {
            int num = numbers[i];
            int count = 0;

            // Count digits of the current number
            while (num != 0) {
                num /= 10;
                count++;
            }

            // Handle case for 0, as it has 1 digit
            if (numbers[i] == 0) {
                count = 1;
            }

            // Output the result
            System.out.println("Number " + numbers[i] + " has " + count + " digit(s).");
        }

        scanner.close();
    }
}
