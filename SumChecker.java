import java.util.Scanner;

public class SumChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Check using equality operator
        if ((num1 + num2) == num3) {
            System.out.println("True: The third number is the sum of the first two.");
        } else {
            System.out.println("False: The third number is NOT the sum of the first two.");
        }

        scanner.close();
    }
}