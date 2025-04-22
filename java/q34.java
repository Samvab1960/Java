// q34.java
import java.util.Scanner;

public class q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number for multiplication table
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Input the range for the table (e.g., up to 10)
        System.out.print("Enter the range (e.g., 10): ");
        int range = scanner.nextInt();

        int i = 1;

        // While loop to print multiplication table
        while (i <= range) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

        scanner.close();
    }
}
