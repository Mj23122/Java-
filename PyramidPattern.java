import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // 1. Print leading spaces to create the pyramid shape
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // 2. Print the stars (number of stars = 2*i - 1)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // 3. Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}