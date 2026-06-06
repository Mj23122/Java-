import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        // Ternary operator to determine the grade
        // Logic: 90+ = A, 80+ = B, 70+ = C, 60+ = D, else = F
        String grade = (marks >= 90) ? "A" :
                (marks >= 80) ? "B" :
                (marks >= 70) ? "C" :
                (marks >= 60) ? "D" : "F";

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}