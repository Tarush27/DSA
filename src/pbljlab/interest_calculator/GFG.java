package pbljlab.interest_calculator;

// Java program to find the prime numbers
// between a given interval
import java.util.Scanner;

class GFG {

    // driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Declare the variables
        int a, b, i, j,flag;

        // Ask user to enter lower value of interval
        System.out.printf( "Enter lower bound of the interval: ");
        a = sc.nextInt(); // Take input

        // Ask user to enter upper value of interval
        System.out.printf( "\nEnter upper bound of the interval: ");
        b = sc.nextInt(); // Take input

        // Print display message
        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);

        // Explicitly handling the cases when a is less than 2
        if (a == 1) {
            System.out.println(a);
            a++;
            if (b >= 2) {
                System.out.println(a);
                a++;
            }
        }
        if (a == 2)
            System.out.println(a);

        // MAKING SURE THAT a IS ODD BEFORE WE BEGIN
        // THE LOOP
        if (a % 2 == 0)
            a++;

        // NOTE : WE TRAVERSE THROUGH ODD NUMBERS ONLY
        for (i = a; i <= b; i = i + 2) {

            // flag variable to tell
            // if i is prime or not
            flag = 1;

            // WE TRAVERSE TILL SQUARE ROOT OF j only.
            // (LARGEST POSSIBLE VALUE OF A PRIME FACTOR)
            for (j = 2; j * j <= i; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }

    }
}


