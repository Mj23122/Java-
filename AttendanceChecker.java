import java.util.Scanner;

public class AttendanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of classes conducted and attended
        System.out.print("Enter the number of classes conducted: ");
        double conducted = scanner.nextDouble();

        System.out.print("Enter the number of classes attended: ");
        double attended = scanner.nextDouble();

        // Calculate attendance percentage
        if (conducted > 0) {
            double percentage = (attended / conducted) * 100;

            System.out.printf("Attendance Percentage: %.2f%%\n", percentage);

            // Eligibility logic
            if (percentage >= 75.0) {
                System.out.println("Result: Eligible for Exam");
            } else {
                System.out.println("Result: Not Eligible");
            }
        } else {
            System.out.println("Error: Classes conducted must be greater than zero.");
        }

        scanner.close();
    }
}
