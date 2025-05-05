public class variable {
    public static void main(String[] args) {
        // Declare and initialize variables
        int count = 5;
        String name = "Java";
        double price = 19.99;

        System.out.println("Original values:");
        System.out.println("count = " + count);
        System.out.println("name = " + name);
        System.out.println("price = " + price);

        // Update variable values
        count = 10;                  // Update int value
        name = "Advanced Java";      // Update String value
        price = 29.99;               // Update double value

        System.out.println("\nUpdated values:");
        System.out.println("count = " + count);
        System.out.println("name = " + name);
        System.out.println("price = " + price);

        // You can also update using expressions
        count = count + 5;           // Or count += 5
        price = price * 0.9;         // Apply 10% discount

        System.out.println("\nFurther updated values:");
        System.out.println("count = " + count);
        System.out.println("price = " + price);

        int a = 10;
        int b = 11;
        int c;
        c = a; // Copy the value of a to c
        a = b;

        System.out.println("\n After copying c to a and a to b:");
        System.out.println("a = " + a );
        System.out.println("b = " + b );
        System.out.println("c = " + c );
        System.out.println(a);

        int marks1 = 72;
        System.out.println(marks1);

        name = "Adam";
        System.out.println(name);

        System.out.println("marks1");

        int x = 2;
        System.out.println(x);
        System.out.println('x');
        System.out.println("x");
    }
}
