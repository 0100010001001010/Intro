/* 
 * If you know the balance and the annual percentage interest rate, you can compute the interest on the next monthly payment using the following formula:
 * 
 *                                                         interest = balance * (annualInterestRate/1200)
 * 
 * Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month. Here is a sample run:
 * 
 * DJ Booker
 * 2025-03-24
 */

// import scanner
import java.util.Scanner;

public class CalculatedInterest {
    public static void main(String[] args) {

        // create scanner
        try (Scanner input = new Scanner(System.in)) {

            // ask user to enter their balance and interest rate
            System.out.print("Enter the balance and interest rate (e.x., 3 for 3%): ");
            double balance = input.nextDouble();
            double annualInterestRate = input.nextDouble();

            // calculate interest
            // For 2 decimal places: * 100.0) / 100.0
            // For 3 decimal places: * 1000.0) / 1000.0
            // For 4 decimal places: * 10000.0) / 10000.0
            double interest = Math.round(balance * (annualInterestRate / 1200) * 100000.0) / 100000.0;

            // display interest rate to the console
            System.out.println("The interest rate is " + interest);
        }
    }

}
