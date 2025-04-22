// q1.java

public class q1 {
    public static void main(String[] args) {
        int count = 0;  // To count the number of primes found
        int num = 2;    // Start checking from the first prime number
        int sum = 0;    // To store the sum of prime numbers

        while (count < 20) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("The sum of the first 20 prime numbers is: " + sum);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
