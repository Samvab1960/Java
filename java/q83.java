// q83.java
import java.util.Scanner;

public class q83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Array to store digit counts (0-9)
        int[] digitCount = new int[10];

        // Count occurrences of each digit
        while (number > 0) {
            int digit = (int)(number % 10);
            digitCount[digit]++;
            number /= 10;
        }

        // Print the result
        System.out.println("Digit occurrences:");
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 0) {
                System.out.println("Digit " + i + ": " + digitCount[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
