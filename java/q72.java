// q72.java
import java.util.Scanner;

public class q72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Print numbers from N to 1 in reverse order
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
