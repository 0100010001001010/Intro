
/* 
 * Write a program that displays sales tax
 * 
 * DJ Booker
 * 21 MAR 2025
 */
// Import scanner
import java.util.*;

public class SalesTax {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (// Establish scanner
                Scanner input = new Scanner(System.in)) {
            // Ask for user purchase amount
            System.out.println("Enter purchase amount: ");
            double purchaseAmount = input.nextDouble();

            // Establish tax and display to the console
            double tax = purchaseAmount * 0.06;
            System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
        }
    }
}
