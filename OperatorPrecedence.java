public class OperatorPrecedence {
    public static void main(String[] args) {
        // Example 1: Basic arithmetic precedence
        System.out.println("Example 1: Basic Arithmetic");
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("Explanation: Multiplication (*) has higher precedence than addition (+)");
        System.out.println("So 5 * 2 is calculated first (10), then added to 10\n");

        // Example 2: Parentheses changing precedence
        System.out.println("Example 2: Using Parentheses");
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("Explanation: Parentheses have highest precedence");
        System.out.println("So 10 + 5 is calculated first (15), then multiplied by 2\n");

        // Example 3: Complex expression
        System.out.println("Example 3: Complex Expression");
        int result3 = 20 - 4 * 2 + 8 / 2;
        System.out.println("20 - 4 * 2 + 8 / 2 = " + result3);
        System.out.println("Explanation: Order of operations:");
        System.out.println("1. 4 * 2 = 8 (multiplication)");
        System.out.println("2. 8 / 2 = 4 (division)");
        System.out.println("3. 20 - 8 + 4 = 16 (addition and subtraction left to right)\n");

        // Example 4: Mixed operators
        System.out.println("Example 4: Mixed Operators");
        boolean result4 = 5 > 3 && 10 + 2 < 15;
        System.out.println("5 > 3 && 10 + 2 < 15 = " + result4);
        System.out.println("Explanation: Order of operations:");
        System.out.println("1. 10 + 2 = 12 (arithmetic first)");
        System.out.println("2. 5 > 3 and 12 < 15 (comparisons)");
        System.out.println("3. true && true (logical AND)");
    }
}
