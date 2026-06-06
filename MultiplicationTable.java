import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: The number for the table
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication Table for " + num + ":");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}