public class MethodOverloading {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        // Test cases for two integers
        int sum1 = add(5, 10);
        System.out.println("Sum of two integers (5 + 10): " + sum1);
        
        // Test cases for two doubles
        double sum2 = add(5.5, 10.5);
        System.out.println("Sum of two doubles (5.5 + 10.5): " + sum2);
        
        // Test cases for three integers
        int sum3 = add(5, 10, 15);
        System.out.println("Sum of three integers (5 + 10 + 15): " + sum3);
        
        // Additional test cases showing automatic type conversion
        System.out.println("\nAdditional Test Cases:");
        
        // Integer to double conversion
        double sum4 = add(5.5, 10); // Second argument is automatically converted to double
        System.out.println("Sum with automatic conversion (5.5 + 10.0): " + sum4);
        
        // Multiple integer combinations
        System.out.println("Different integer combinations:");
        System.out.println("add(1, 2): " + add(1, 2));
        System.out.println("add(1, 2, 3): " + add(1, 2, 3));
        
        // Different double combinations
        System.out.println("\nDifferent double combinations:");
        System.out.println("add(1.5, 2.5): " + add(1.5, 2.5));
        System.out.println("add(1.0, 2.0): " + add(1.0, 2.0));
    }
}
