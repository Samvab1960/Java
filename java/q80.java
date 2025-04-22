// q80.java
import java.util.Scanner;

public class q80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize max and second max values
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Loop to find the two largest numbers
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        int highestProduct = max1 * max2;
        System.out.println("The highest product of any two numbers is: " + highestProduct);

        scanner.close();
    }
}
