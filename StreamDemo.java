
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20);

        // Display original list
        System.out.println("Original List:");
        numbers.forEach(System.out::println);

        // Filter even numbers using Stream API
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("\nEven Numbers:");
        evenNumbers.forEach(System.out::println);

        // Filter even numbers and multiply by 2
        List<Integer> doubledEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("\nEven Numbers Doubled:");
        doubledEven.forEach(System.out::println);

        // Sum of all even numbers
        int sumEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("\nSum of Even Numbers: " + sumEven);

        // Average of all numbers
        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average of All Numbers: " + average);

        // Find numbers greater than 10
        List<Integer> largeNumbers = numbers.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println("\nNumbers Greater Than 10:");
        largeNumbers.forEach(System.out::println);

        // Count of even numbers
        long evenCount = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("\nCount of Even Numbers: " + evenCount);

        // Find first even number greater than 5
        int firstEvenGreaterThan5 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 5)
                .findFirst()
                .orElse(0);

        System.out.println("First Even Number Greater Than 5: " + firstEvenGreaterThan5);
    }
}
