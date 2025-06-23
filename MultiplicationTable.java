import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":");
        System.out.println("------------------------");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;

            System.out.printf("%d × %d = %d%n", number, i, result);
        }

        scanner.close();
    }
}
