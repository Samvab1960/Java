public class q92 {
    public static void main(String[] args) {
        // Define the size of the hourglass
        int n = 5;  // Change this value to adjust the size of the hourglass

        // Upper half of the hourglass (including the middle line)
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers in the decreasing pattern
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print(n - i);
            }

            // Move to the next line
            System.out.println();
        }

        // Lower half of the hourglass
        for (int i = 1; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Print numbers in the increasing pattern
            for (int j = 0; j < (2 * (i + 1) - 1); j++) {
                System.out.print(i + 1);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
