import java.util.Scanner;

public class ArrayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get array size
            System.out.print("Enter the number of elements (or 0 to exit): ");

            // Validate input for size
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // Clear invalid input
            }

            int size = scanner.nextInt();

            // Check for exit condition
            if (size == 0) {
                System.out.println("Thank you for using Array Calculator!");
                break;
            }

            // Validate positive size
            if (size < 0) {
                System.out.println("Please enter a positive number!");
                continue;
            }

            // Create and populate the array
            double[] numbers = new double[size];
            System.out.println("\nEnter " + size + " numbers:");

            for (int i = 0; i < size; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");

                // Validate input for each number
                while (!scanner.hasNextDouble()) {
                    System.out.println("Please enter a valid number!");
                    scanner.next(); // Clear invalid input
                    System.out.print("Enter number " + (i + 1) + ": ");
                }

                numbers[i] = scanner.nextDouble();
            }

            // Calculate sum and average
            double sum = calculateSum(numbers);
            double average = calculateAverage(numbers);

            // Display results
            System.out.println("\nResults:");
            System.out.println("Array elements: ");
            displayArray(numbers);
            System.out.printf("Sum: %.2f%n", sum);
            System.out.printf("Average: %.2f%n", average);

            // Find and display minimum and maximum
            double min = findMin(numbers);
            double max = findMax(numbers);
            System.out.printf("Minimum value: %.2f%n", min);
            System.out.printf("Maximum value: %.2f%n", max);
            System.out.println();
        }

        scanner.close();
    }

    // Calculate sum of array elements
    public static double calculateSum(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    // Calculate average of array elements
    public static double calculateAverage(double[] arr) {
        if (arr.length == 0)
            return 0;
        return calculateSum(arr) / arr.length;
    }

    // Find minimum value in array
    public static double findMin(double[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array is empty");
        double min = arr[0];
        for (double num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // Find maximum value in array
    public static double findMax(double[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array is empty");
        double max = arr[0];
        for (double num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Display array elements
    public static void displayArray(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f", arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
