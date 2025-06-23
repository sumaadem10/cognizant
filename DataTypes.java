public class DataTypes {
    public static void main(String[] args) {
        int age = 25;
        System.out.println("Integer example:");
        System.out.println("Age: " + age);
        System.out.println("Size: " + Integer.SIZE + " bits");
        System.out.println("Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println();
        float temperature = 98.6f;
        System.out.println("Float example:");
        System.out.println("Temperature: " + temperature);
        System.out.println("Size: " + Float.SIZE + " bits");
        System.out.println("Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println();
        double pi = 3.14159265359;
        System.out.println("Double example:");
        System.out.println("Pi: " + pi);
        System.out.println("Size: " + Double.SIZE + " bits");
        System.out.println("Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println();
        char grade = 'A';
        System.out.println("Character example:");
        System.out.println("Grade: " + grade);
        System.out.println("Size: " + Character.SIZE + " bits");
        System.out.println();
        boolean isJavaFun = true;
        System.out.println("Boolean example:");
        System.out.println("Is Java Fun?: " + isJavaFun);
        System.out.println();
        byte byteNum = 127;
        short shortNum = 32000;
        long longNum = 9223372036854775807L;

        System.out.println("Additional primitive types:");
        System.out.println("Byte value: " + byteNum);
        System.out.println("Short value: " + shortNum);
        System.out.println("Long value: " + longNum);
        System.out.println("\nPrecision demonstration:");
        float f1 = 123.456789f;
        double d1 = 123.456789;
        System.out.println("Float precision: " + f1);
        System.out.println("Double precision: " + d1);
    }
}