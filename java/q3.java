// q3.java

public class q3 {
    public static void main(String[] args) {
        int num = 1;  // Start from the first odd number

        // Do-while loop to print odd numbers from 1 to 100
        do {
            System.out.println(num);
            num += 2;  // Increment by 2 to get the next odd number
        } while (num <= 100);  // Continue loop as long as num is less than or equal to 100
    }
}
