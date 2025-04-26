public class Conditional_Statements_and_If_Else {   // This is a Java class that demonstrates the use of conditional statements and if-else constructs.

        public static void main(String[] args) {  // The main method is the entry point of the program.
                // This program demonstrates the use of conditional statements in Java.
                int number = 10;  // Declare and initialize an integer variable

                // Simple if statement
                if (number > 0) {   // Check if the number is greater than 0
                        System.out.println("The number is positive."); 
                }

                // If-else statement
                int anotherNumber = -5;   // Declare and initialize another integer variable
                if (anotherNumber > 0) {  // Check if the anotherNumber is greater than 0
                        System.out.println("Another number is positive.");
                } else {
                        System.out.println("Another number is not positive (it's zero or negative).");
                }

                // If-else if-else statement
                int grade = 75;  // Declare and initialize an integer variable for grade
                if (grade >= 90) {  // Check if the grade is greater than or equal to 90
                        System.out.println("Grade is A");
                } else if (grade >= 80) {   // Check if the grade is greater than or equal to 80
                        System.out.println("Grade is B");
                } else if (grade >= 70) {   // Check if the grade is greater than or equal to 70
                        System.out.println("Grade is C");
                } else if (grade >= 60) {   // Check if the grade is greater than or equal to 60
                        System.out.println("Grade is D");
                } else {   // If none of the above conditions are met
                        System.out.println("Grade is F");
                }

                // Ternary operator (shorthand for if-else)
                boolean isEven = (number % 2 == 0);  // Check if the number is even
                String result = isEven ? "The first number is even." : "The first number is odd.";  // Use the ternary operator to assign a value to result based on the condition
                System.out.println(result);
        }
}