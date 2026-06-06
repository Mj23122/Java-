import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }

        scanner.close();
    }

    // Method to check primality
    public static boolean isPrime(int n) {
        // Numbers <= 1 are not prime
        if (n <= 1) {
            return false;
        }

        // Check for factors from 2 up to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a factor, not prime
            }
        }
        return true; // No factors found, it is prime
    }
}
