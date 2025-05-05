import java.util.Scanner;  // import the Scanner class
 public class userInput {       // create a class
    public static void main (  String [] args ) {    // create a main method
        int numberA;                      // declare a variable
        int numberB;                     // declare a variable
        Scanner input = new Scanner(System.in);         // create a Scanner object

        System.out.println("Enter the value of a");            // print a message
        numberA = input.nextInt();          // read the value of a

        System.out.println("Enter the value of b");   // print a message
        numberB = input.nextInt();          // read the value of b

        System.out.println(numberA  + numberB);    // print the sum of a and b

        // Ask the user to input three integer variable: a, b, and c. then Calculation of : a *b + c.
        int numberC;                      // declare a variable
        int numberD;                     // declare a variable
        int numberE;                    // declare a variable

        System.out.println("Enter the value of c");            // print a message
        numberC = input.nextInt();          // read the value of c
        System.out.println("Enter the value of d");            // print a message
        numberD = input.nextInt();          // read the value of d
        System.out.println("Enter the value of e");            // print a message
        numberE = input.nextInt();          // read the value of e

        System.out.println(numberC * numberD + numberE);    // print the calculation of c * d + e

        // Ask the use to input a temperature in Celsius and convert it to Fahrenheit
        double celsius;                      // declare a variable
        double fahrenheit;                     // declare a variable

        System.out.println("Enter the temperature in Celsius");            // print a message
        celsius = input.nextDouble();          // read the value of celsius

        fahrenheit = (celsius * 9/5) + 32;    // convert celsius to fahrenheit
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);    // print the temperature in fahrenheit
    }
}

