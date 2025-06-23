import java.util.HashMap;
import java.util.Scanner;

public class StudentIDManager {
    public static void main(String[] args) {
        // Create HashMap to store student IDs and names
        HashMap<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent ID Manager");
            System.out.println("1. Add a student");
            System.out.println("2. Find student by ID");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID (integer): ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (students.containsKey(id)) {
                        System.out.println("Error: ID already exists!");
                        break;
                    }

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.put(id, name);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student ID to search: ");
                    int searchId = scanner.nextInt();
                    String studentName = students.get(searchId);

                    if (studentName != null) {
                        System.out.println("Student found: " + studentName);
                    } else {
                        System.out.println("No student found with ID: " + searchId);
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No students in the database.");
                    } else {
                        System.out.println("\nStudent Database:");
                        for (Integer studentId : students.keySet()) {
                            System.out.println("ID: " + studentId + " | Name: " + students.get(studentId));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}