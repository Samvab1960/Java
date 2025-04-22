public class q86 {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, -3, 5, 0, -2, 8, -6};
        
        int positiveCount = 0;
        int negativeCount = 0;
        
        // Iterate through the array
        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        
        // Output the counts
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
    }
}
