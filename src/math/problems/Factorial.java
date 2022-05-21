package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


        {
            int num = 5;
            System.out.println("getFactorial of " + num
                    + " is " + factorial(5));
        }
    }
    public static int factorial( int numero ) {
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
            fact *= i;
        }

        return fact;
    }
}

