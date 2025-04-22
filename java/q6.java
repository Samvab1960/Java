// q6.java

public class q6 {
    public static void main(String[] args) {
        // Loop to display the multiplication table for numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            
            // Inner loop to display the multiplication of i with numbers 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            
            // Print an empty line after each table for readability
            System.out.println();
        }
    }
}
