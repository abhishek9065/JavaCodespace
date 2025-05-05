import java.util.*;
public class source {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        float f = input.nextFloat();
        double d = input.nextDouble();

        // Perform the required casting operations
        float x = (float) a;     // Cast int to float
        int y = (int) f;         // Cast float to int
        float z = (float) d;     // Cast double to float

        // Print output in the required format
        System.out.println("x=" + x + " y=" + y + " z=" + z);
    }
}