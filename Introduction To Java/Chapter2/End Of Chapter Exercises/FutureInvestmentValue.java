/* 
 * Write a program that reads in investment amount, annual interest rate, and number of years, and displays the future investment value using the following formula:
 * 
 *                              futureInvestmentValue= investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 * 
 * 
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 * of years 1, the future investment value is 1032.98.
 * 
 * DJ Booker
 * 2025-03-25
 */

// import scanner
import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {

        // create scanner
        try (Scanner input = new Scanner(System.in)) {

            // ask user for investment amount:
            System.out.print("Enter investment amount: ");
            double investmentAmount = input.nextDouble();

            // ask user for annual interest rate in percentage:
            System.out.print("Enter annual interest rate in percentage: ");
            double annualInterestRate = input.nextDouble();

            // ask user for number of years:
            System.out.print("Enter number of years: ");
            double numberOfYears = input.nextDouble();

            // close scanner
            input.close();

            // Convert annual rate to monthly decimal
            double monthlyInterestRate = annualInterestRate / 1200; 

            // Calculate future investment value
            double futureInvestmentValue = Math
                    .round(investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12) * 100.0) / 100.0;

            // Display result to the console
            System.out.println("Accumulated value is $" + futureInvestmentValue);

        }

    }
}
