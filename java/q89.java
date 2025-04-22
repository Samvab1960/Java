public class q89 {
    public static void main(String[] args) {
        // Define the size of the checkerboard
        int rows = 8;
        int columns = 8;
        
        // Generate the checkerboard pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Print alternating numbers (1 and 0)
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
