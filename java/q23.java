// File: q23.java

import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("Sum of squares of first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}
