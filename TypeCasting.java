public class TypeCasting {
    public static void main(String[] args) {
        // Double to Int casting
        System.out.println("Converting Double to Int:");
        double doubleNumber = 123.456;
        System.out.println("Original double value: " + doubleNumber);

        // Explicit casting from double to int (narrowing conversion)
        int intNumber = (int) doubleNumber;
        System.out.println("After casting to int: " + intNumber);
        System.out.println("Notice that decimal places are truncated\n");

        // Int to Double casting
        System.out.println("Converting Int to Double:");
        int anotherInt = 456;
        System.out.println("Original int value: " + anotherInt);

        // Implicit casting from int to double (widening conversion)
        double anotherDouble = anotherInt; // No explicit cast needed
        System.out.println("After casting to double: " + anotherDouble);
        System.out.println("Notice that .0 is added automatically\n");

        // Additional casting examples
        System.out.println("Additional Casting Examples:");
        double piValue = 3.14159;
        System.out.println("Original pi value: " + piValue);
        System.out.println("Casting pi to int: " + (int) piValue);

        int largeNumber = 123456;
        System.out.println("\nOriginal large number: " + largeNumber);
        System.out.println("Casting to double: " + (double) largeNumber);
    }
}
