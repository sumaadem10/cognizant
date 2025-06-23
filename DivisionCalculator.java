import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Get first number
                System.out.print("Enter the first number (dividend) or 'q' to quit: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Thank you for using the Division Calculator!");
                    break;
                }

                int dividend = Integer.parseInt(input);

                // Get second number
                System.out.print("Enter the second number (divisor): ");
                int divisor = Integer.parseInt(scanner.nextLine());

                // Perform division
                int result = dividend / divisor;
                System.out.printf("%d divided by %d is: %d%n", dividend, divisor, result);
                System.out.printf("Remainder is: %d%n%n", dividend % divisor);

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid numbers!\n");
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero!\n");
            }
        }

        scanner.close();
    }
}