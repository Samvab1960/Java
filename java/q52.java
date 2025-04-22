// q52.java
import java.util.Scanner;

public class q52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print the multiplication table in reverse order (from 10 to 1)
        System.out.println("Multiplication table of " + number + " in reverse order:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
