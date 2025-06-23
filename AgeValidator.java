import java.util.Scanner;

public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older. You are " + age + " years old.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter your age (or -1 to exit): ");
                int age = scanner.nextInt();

                if (age == -1) {
                    System.out.println("Thank you for using Age Validator!");
                    break;
                }

                validateAge(age);
                System.out.println("Age validation successful! You are " + age + " years old.\n");

            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid number!\n");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
