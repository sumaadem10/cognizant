import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add student");
            System.out.println("2. Display all students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                students.add(name);
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students in the list.");
                } else {
                    System.out.println("\nStudent List:");
                    for (String student : students) {
                        System.out.println(student);
                    }
                }
            } else if (choice == 3) {
                break;
            }
        }
        scanner.close();
    }
} 