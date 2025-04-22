// q29.java
import java.util.Scanner;

public class q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Validate input
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[size];
        int sum = 0;

        // Input array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / size;

        // Output result
        System.out.println("Average of the array elements: " + average);

        scanner.close();
    }
}
