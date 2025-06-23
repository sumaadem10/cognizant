public class PatternMatchingSwitchDemo {

    public static void main(String[] args) {
        testType(42);
        testType("Hello, Java 21!");
        testType(3.14);
        testType(true);
        testType(null);
    }

    public static void testType(Object obj) {
        // Enhanced switch with pattern matching (Java 21)
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer with value: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double with value: " + d);
            case Boolean b -> System.out.println("It's a Boolean: " + b);
            case null -> System.out.println("It's null!");
            default -> System.out.println("Unknown type: " + obj);
        }
    }
}
