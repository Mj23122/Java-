import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] steps = new int[7];
        int totalSteps = 0;
        int maxSteps = 0;

        // Loop to get input for 7 days
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter steps walked on day " + (i + 1) + ": ");
            steps[i] = scanner.nextInt();

            // Add to total
            totalSteps += steps[i];

            // Check for highest steps
            if (steps[i] > maxSteps) {
                maxSteps = steps[i];
            }
        }

        // Calculate average
        double averageSteps = (double) totalSteps / 7;

        // Display results
        System.out.println("\n--- Fitness Report ---");
        System.out.println("Total steps: " + totalSteps);
        System.out.printf("Average steps: %.2f\n", averageSteps);
        System.out.println("Highest number of steps: " + maxSteps);

        scanner.close();
    }
}
