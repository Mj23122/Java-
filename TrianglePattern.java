import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop to print stars based on current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing stars in a row
            System.out.println();
        }

        scanner.close();
    }
}