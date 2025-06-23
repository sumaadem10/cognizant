import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.add("David");

        System.out.println("Original list:");
        names.forEach(name -> System.out.println(name));

        // Sort using lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("\nSorted list:");
        names.forEach(name -> System.out.println(name));

        // Sort by length using lambda expression
        Collections.sort(names, (s1, s2) -> s1.length() - s2.length());

        System.out.println("\nSorted by length:");
        names.forEach(name -> System.out.println(name));
    }
} 