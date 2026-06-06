import java.util.Scanner;

public class SmartAttendanceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes conducted: ");
        int classesConducted = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int classesAttended = sc.nextInt();

        if (classesConducted == 0) {
            System.out.println("Total classes conducted cannot be zero.");
        } else {
            double attendancePercentage =
                    (double) classesAttended / classesConducted * 100;

            System.out.printf("Attendance Percentage: %.2f%%\n",
                    attendancePercentage);

            if (attendancePercentage >= 75) {
                System.out.println("Eligible for Exam");
            } else {
                System.out.println("Not Eligible");
            }
        }

        sc.close();
    }
}