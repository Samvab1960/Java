// q68.java
import java.util.Scanner;

public class q68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create array and take input
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Initialize smallest element
        int smallest = arr[0];

        // Loop to find the smallest element
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Output the result
        System.out.println("The smallest element in the array is: " + smallest);

        scanner.close();
    }
}
