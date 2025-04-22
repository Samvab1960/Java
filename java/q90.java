import java.util.Arrays;

public class q90 {
    public static void main(String[] args) {
        // Example array
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Call method to find the second smallest number
        int secondSmallest = findSecondSmallest(arr);

        // Output the second smallest number
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest number is: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest number.");
        }
    }

    // Method to find the second smallest number in an array
    public static int findSecondSmallest(int[] arr) {
        // Edge case: If the array has fewer than 2 elements
        if (arr.length < 2) {
            return Integer.MAX_VALUE;  // Return a value that indicates no second smallest exists
        }

        // Initialize the smallest and second smallest as maximum possible value
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse the array to find the smallest and second smallest
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }
}
