import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nFile Writing Options:");
            System.out.println("1. Write new content");
            System.out.println("2. Append content");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 3) {
                System.out.println("Thank you for using File Writer!");
                break;
            }

            System.out.print("Enter the text to write: ");
            String content = scanner.nextLine();

            try {
                if (choice == 1) {
                    // Write new content (overwrite existing file)
                    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("output.txt"))) {
                        writer.write(content);
                    }
                    System.out.println("Content has been written to output.txt");

                } else if (choice == 2) {
                    // Append content
                    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("output.txt"),
                            StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
                        writer.newLine();
                        writer.write(content);
                    }
                    System.out.println("Content has been appended to output.txt");
                }

                // Display file contents
                System.out.println("\nCurrent file contents:");
                Files.readAllLines(Paths.get("output.txt"))
                        .forEach(System.out::println);

            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
