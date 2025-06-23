import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Clean the string: remove non-alphanumeric and convert to lowercase
        String cleanString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if it's a palindrome
        boolean isPalindrome = true;
        int length = cleanString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanString.charAt(i) != cleanString.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("\nOriginal string: " + input);
        System.out.println("Cleaned string: " + cleanString);
        if (isPalindrome) {
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("This is not a palindrome.");
        }

        scanner.close();
    }
}