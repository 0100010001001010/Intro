/* 
 * Implementation is also known as coding (writing the code). In the formula, you have to compute (1 + monthlyInterestRate)numberOfYears * 12, 
 * which can be obtained using Math.pow(1 + monthlyInterestRate, numberOfYears * 12).
 * 
 * DJ Booker
 * 21 MAR 2025
 */

// import scanner class
import java.util.*;

public class ComputeLoan {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (// create a scanner
                Scanner input = new Scanner(System.in)) {
            // enter annual intrest rate in percentage, e.g., 7.25%
            System.out.print("Enter annual intresr rate, e.g., 7.25%: ");
            double annualIntrestRate = input.nextDouble();

            // obtain monthly intrest rate
            double monthlyInterestRate = annualIntrestRate / 1200;

            // enter number of years
            System.out.print(
                    "Enter number of years as an integer, e.g., 5: ");
            int numberOfYears = input.nextInt();

            // enter loan amount
            System.out.print("Enter loan amount, e.g., 120000.95: ");
            double loanAmount = input.nextDouble();
            input.close();

            // calculate payment
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            //Display results to the console
            System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
            System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);
        }
    }
}
