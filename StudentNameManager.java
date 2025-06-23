
import java.util.ArrayList;
import java.util.Scanner;

public class StudentNameManager {
    public static void main(String[] args) {
        // Create ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Name Manager");
            System.out.println("1. Add a student name");
            System.out.println("2. Display all names");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    studentNames.add(name);
                    System.out.println("Name added successfully!");
                    break;

                case 2:
                    if (studentNames.isEmpty()) {
                        System.out.println("No student names in the list.");
                    } else {
                        System.out.println("\nStudent Names:");
                        for (int i = 0; i < studentNames.size(); i++) {
                            System.out.println((i + 1) + ". " + studentNames.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
