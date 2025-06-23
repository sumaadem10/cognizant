import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Method 1: Using StringBuilder
        StringBuilder reversed1 = new StringBuilder(input).reverse();
        System.out.println("\nMethod 1 (StringBuilder):");
        System.out.println("Reversed string: " + reversed1);

        // Method 2: Using a char array and loop
        System.out.println("\nMethod 2 (Manual loop):");
        char[] charArray = input.toCharArray();
        System.out.print("Reversed string: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

        scanner.close();
    }
}