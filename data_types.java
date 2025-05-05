public class data_types {
    public static void main(String[] args) {
        // Integer data types
        byte byteValue = 127;                // 8-bit, range: -128 to 127
        short shortValue = 32767;            // 16-bit, range: -32,768 to 32,767
        int intValue = 2147483647;           // 32-bit, range: -2^31 to 2^31-1
        long longValue = 9223372036854775807L; // 64-bit, range: -2^63 to 2^63-1, note the 'L' suffix

        // Floating-point data types
        float floatValue = 3.14159f;         // 32-bit, note the 'f' suffix
        double doubleValue = 3.141592653589793; // 64-bit, higher precision

        // Character data type
        char charValue = 'A';                // 16-bit Unicode character

        // Boolean data type
        boolean booleanValue = true; // can be either true or false

        // Output all values
        System.out.println("Primitive Data Types in Java:");
        System.out.println("----------------------------");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue + " (Unicode value: " + (int)charValue + ")");
        System.out.println("boolean: " + booleanValue);

        // Demonstrating type casting
        System.out.println("\nType Casting Examples:");
        System.out.println("-------------------");

        // Implicit casting (widening)
        int smallerInt = 100;
        long biggerLong = smallerInt;  // Automatic casting from int to long
        System.out.println("int to long: " + biggerLong);

        // Explicit casting (narrowing)
        double largeDouble = 100.99;
        int truncatedInt = (int)largeDouble;  // Explicit cast, fractional part is truncated
        System.out.println("double to int: " + truncatedInt);

        // Description:
        //Consider that you want to store distance between two points in variables.
        //The distance given is 2.367 kms.
        //Initialize a variable named “distance” to store the distance in kilometres.
        //Initialize a variable named “distanceInMetres” to store the distance in metres.
        //Note: Remember to use appropriate data types to store the distances.
        //The code stub given will print the values accordingly, you only have to initialize the variables.

        //Solution:

        double distance = 2.367;
        double distanceInMetres = distance * 1000;

        System.out.println("distance:" + distance);
        System.out.println("distanceInMeter:" + distanceInMetres);
    }
}
