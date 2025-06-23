import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive integer (or 0 to exit): ");

            // Validate input
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // Clear invalid input
            }

            int n = scanner.nextInt();

            // Check for exit condition
            if (n == 0) {
                System.out.println("Thank you for using Fibonacci Calculator!");
                break;
            }

            // Validate positive input
            if (n < 0) {
                System.out.println("Please enter a positive number!");
                continue;
            }

            // Calculate and display Fibonacci number
            try {
                long result = fibonacci(n);
                System.out.printf("The %dth Fibonacci number is: %d%n", n, result);

                // Display the sequence up to n
                System.out.println("\nFibonacci sequence up to " + n + ":");
                for (int i = 1; i <= n; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                System.out.println("\n");
            } catch (ArithmeticException e) {
                System.out.println("The number is too large to calculate!");
            }
        }

        scanner.close();
    }

    public static long fibonacci(int n) {
        // Base cases
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        // Check for overflow before recursion
        long prev = fibonacci(n - 1);
        long prevPrev = fibonacci(n - 2);

        // Check for overflow
        if (prev > Long.MAX_VALUE - prevPrev) {
            throw new ArithmeticException("Fibonacci number too large");
        }

        return prev + prevPrev;
    }
}