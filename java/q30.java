// q30.java
import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] spiral = new int[rows][cols];

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        int num = 1;

        // Spiral pattern using nested loops
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                spiral[top][i] = num++;
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = num++;
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = num++;
                }
                bottom--;
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = num++;
                }
                left++;
            }
        }

        // Print the spiral matrix
        System.out.println("Spiral pattern:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", spiral[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
