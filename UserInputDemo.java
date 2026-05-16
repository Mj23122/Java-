import java.util.Scanner; // Required to capture user input

public class UserInputDemo {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        System.out.println("--- Calculate the Sum of Two Numbers ---");

        // Prompt user for the first number
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        // Prompt user for the second number
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Good practice: close the scanner when done to free up resources
        input.close();
    }
}