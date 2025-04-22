// q15.java

public class q15 {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Skip numbers that are multiples of 3 or 5
            if (i % 3 == 0 || i % 5 == 0) {
                continue;  // Skip the current iteration if the condition is met
            }
            // Print the number if it is not a multiple of 3 or 5
            System.out.print(i + " ");
        }
    }
}
