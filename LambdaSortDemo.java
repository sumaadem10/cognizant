import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortDemo {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Strawberry");
        fruits.add("Blueberry");

        // Display original list
        System.out.println("Original List:");
        fruits.forEach(fruit -> System.out.println(fruit));

        // Sort by natural order using lambda
        Collections.sort(fruits, (s1, s2) -> s1.compareTo(s2));

        System.out.println("\nSorted by natural order:");
        fruits.forEach(fruit -> System.out.println(fruit));

        // Sort by length using lambda
        Collections.sort(fruits, (s1, s2) -> s1.length() - s2.length());

        System.out.println("\nSorted by length:");
        fruits.forEach(fruit -> System.out.println(fruit));

        // Sort by last character using lambda
        Collections.sort(fruits, (s1, s2) -> s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));

        System.out.println("\nSorted by last character:");
        fruits.forEach(fruit -> System.out.println(fruit));

        // Using lambda with method reference for printing
        System.out.println("\nUsing method reference to print:");
        fruits.forEach(System.out::println);
    }
}