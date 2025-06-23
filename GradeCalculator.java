import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter marks (0-100) or -1 to exit: ");
            double marks = scanner.nextDouble();

            if (marks == -1) {
                System.out.println("Thank you for using Grade Calculator!");
                break;
            }

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                continue;
            }

            String grade = calculateGrade(marks);
            System.out.println("\nMarks: " + marks);
            System.out.println("Grade: " + grade);
            System.out.println("----------------------------------------\n");
        }

        scanner.close();
    }

    public static String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A (Excellent)";
        } else if (marks >= 80) {
            return "B (Very Good)";
        } else if (marks >= 70) {
            return "C (Good)";
        } else if (marks >= 60) {
            return "D (Pass)";
        } else {
            return "F (Fail)";
        }
    }
}
