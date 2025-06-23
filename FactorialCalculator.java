import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a non-negative integer (or -1 to exit): ");

            // Validate input
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer!");
                scanner.next(); // Clear invalid input
            }

            int number = scanner.nextInt();

            // Check for exit condition
            if (number == -1) {
                System.out.println("Thank you for using Factorial Calculator!");
                break;
            }

            // Validate non-negative input
            if (number < 0) {
                System.out.println("Please enter a non-negative integer!");
                continue;
            }

            // Calculate and display factorial
            long factorial = calculateFactorial(number);
            if (factorial == -1) {
                System.out.println("The factorial is too large to calculate!");
            } else {
                System.out.printf("The factorial of %d is: %d%n", number, factorial);
            }
            System.out.println();
        }

        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            // Check for overflow
            if (result > Long.MAX_VALUE / i) {
                return -1; // Indicate overflow
            }
            result *= i;
        }
        return result;
    }
}