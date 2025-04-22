public class q87 {
    public static void main(String[] args) {
        // Example 2D array
        int[][] arr = {
            {1, -3, 5},
            {-2, 8, -6},
            {4, 0, -7}
        };
        
        int sum = 0;
        
        // Iterate through the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Add to sum if the element is positive
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        
        // Output the sum of positive elements
        System.out.println("Sum of positive elements: " + sum);
    }
}
