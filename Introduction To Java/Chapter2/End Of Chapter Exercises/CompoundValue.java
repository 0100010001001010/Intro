/* 
 * Suppose you save $100 each month into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12= 0.00417. After the first month, the value in the account becomes:
 *                                                                  
 *                                                                                  100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes:
 *                                                                                   (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes:
 *                                                                                   (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * 
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month. (In Exercise 5.30, you will use a loop to simplify the code and display the account value for any month.)  
 *  
 * DJ Booker
 * 2025-03-23
 */

// import scanner
import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter the monthly saving amount
        System.out.print(
                "Enter the monthly saving amount: ");
        double monthlySavingAmount = input.nextDouble();
        input.close();

        // calculate the account value after the first month
        double firstMonth = monthlySavingAmount * (1 + 0.00417);

        // calculate the account value after the second month
        double secondMonth = monthlySavingAmount + firstMonth * (1 + 0.00417);
        
        // calculate the account value after the third month
        double thirdMonth = monthlySavingAmount + secondMonth * (1 + 0.00417);

        // calculate the account value after the fourth month
        double fourthMonth = monthlySavingAmount + thirdMonth * (1 + 0.00417);  

        // calculate the account value after the fifth month
        double fifthMonth = monthlySavingAmount + fourthMonth * (1 + 0.00417);

        // calculate the account value after the sixth month
        double sixthMonth = monthlySavingAmount + fifthMonth * (1 + 0.00417);

        // display the results to the console
        System.out.println("The account value after the sixth month is " + sixthMonth);
        
        
    }
}