public class VariableUpdate {
    public static void main (String[] args)
    {
        //declaring the initializing if value in one line
        int distanceAdam = 0, distanceLucy = 0;

        //Printing out initial value of these variable
        System.out.println(distanceAdam);
        System.out.println(distanceLucy);

        // updating these variables
        distanceAdam = distanceAdam + 20;

        // another way to updating by overwrite
        distanceLucy = 25;

        // Printing the Final updated Values
        System.out.println(distanceAdam);
        System.out.println(distanceLucy);

        int a, b;
        a = 1;
        b= 2;
        System.out.println("a=" + b);
        System.out.println("b=" + a);

        long x = 2^63 - 1;
                System.out.println("x=" + x);
    }
}
