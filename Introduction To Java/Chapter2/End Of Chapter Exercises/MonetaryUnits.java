/*
 * Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a double value to an int value. Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents.
 * 
 * 
 * DJ Booker
 * 2025-03-26
 */

// import scanner
import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {

        // create scanner
        try (
                Scanner input = new Scanner(System.in)) {

            // receive the amount
            System.out.print(
                    "Enter an amount as an integer (e.g., 1156 for $11.56): ");
            int amount = input.nextInt();
            int dollars = amount / 100; // save the dollars
            int cents = amount % 100; // save the cents
            double finalAmount = dollars + (cents / 100.0); // convert to double
            input.close();

            int remainingAmount = (int) (finalAmount * 100);

            // find the number of one dollars
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            // find the number of quarters in the remaining amount
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;

            // Find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;

            // Find the number of nickles in the remaining amount
            int numberOfNickles = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;

            // find the numbers of pennies in the remaining amount
            int numberOfPennies = remainingAmount;

            // display results to the console
            System.out.println("Your amount " + amount + " consists of");
            System.out.println("   " + numberOfOneDollars + " dollars");
            System.out.println("   " + numberOfQuarters + " quarters ");
            System.out.println("   " + numberOfDimes + " dimes");
            System.out.println("   " + numberOfNickles + " nickles");
            System.out.println("   " + numberOfPennies + " pennies");
        }

    }
}