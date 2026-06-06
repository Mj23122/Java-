import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        if (isPalindrome(x)) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes (e.g., -121 != 121-)
        // Also, numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = (reversed * 10) + digit;
            x /= 10;
        }

        return original == reversed;
    }
}