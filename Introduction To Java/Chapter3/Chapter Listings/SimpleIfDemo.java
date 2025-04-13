/*
 * Listing 3.2 gives a program that prompts the user to enter an integer. If the number is a multiple of 5, the program displays HiFive. 
 * If the number is divisible by 2, it displays HiEven.
 * 
 * DJ Booker
 * 4/13/2025
 */

// import scanner
import java.util.Scanner;

public class SimpleIfDemo {

    public static void main(String[] args) {

        try (// create scanner object
                Scanner input = new Scanner(System.in)) {
            // prompt user for an integer
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            input.close(); // close scanner

            // check if number is a multiple of 5
            if (number % 5 == 0) {
                System.out.println("HiFive");
            }
            // check if number is even
            if (number % 2 == 0) {
                System.out.println("HiEven");
            }
        }
    }
}
