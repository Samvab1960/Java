import java.util.Random;

public class q96 {
    public static void main(String[] args) {
        // Define the number of rows and columns
        int rows = 4;  // Change this value to adjust the number of rows
        int columns = 5;  // Change this value to adjust the number of columns
        
        // Generate and print the random 2D array
        int[][] array = generateRandom2DArray(rows, columns);
        
        System.out.println("Random 2D Array:");
        print2DArray(array);
    }

    // Method to generate a random 2D array
    public static int[][] generateRandom2DArray(int rows, int columns) {
        Random rand = new Random();
        int[][] array = new int[rows][columns];
        
        // Populate the array with random integers between 0 and 99
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = rand.nextInt(100);  // Random number between 0 and 99
            }
        }
        
        return array;
    }

    // Method to print the 2D array
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
