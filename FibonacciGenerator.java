import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series for " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + (i < n ? ", " : ""));

            // Calculate next term
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}

