import java.util.Scanner;
import java.time.LocalDate;

public class AgePredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Current Age
        System.out.print("Enter your current age: ");
        int currentAge = scanner.nextInt();

        // Calculate ages
        int age10 = currentAge + 10;
        int age25 = currentAge + 25;
        int age50 = currentAge + 50;

        // Output ages
        System.out.println("Age after 10 years: " + age10);
        System.out.println("Age after 25 years: " + age25);
        System.out.println("Age after 50 years: " + age50);

        // Bonus: Predict the year they will turn 100
        int yearsTo100 = 100 - currentAge;
        int currentYear = LocalDate.now().getYear();
        int targetYear = currentYear + yearsTo100;

        if (currentAge < 100) {
            System.out.println("You will turn 100 in the year: " + targetYear);
        } else {
            System.out.println("You have already reached or passed the age of 100!");
        }

        scanner.close();
    }
}
